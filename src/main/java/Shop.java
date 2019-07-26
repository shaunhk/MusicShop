import OtherAbstractClasses.Sell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Sell> stock;

    public Shop(){
        this.stock = new ArrayList<Sell>();
    }

    public ArrayList<Sell> getStock() {
        return this.stock;
    }

    public int getStockAmount(){
        return this.stock.size();
    }

    public void addStock(Sell item){
        this.stock.add(item);
    }

    public void removeStock(Sell item){
        this.stock.remove(item);
    }

    public double getTotalMarkup() {
        double total = 0;
        for(int i = 0; i < this.getStockAmount(); i++){
            double itemProfit = this.stock.get(i).getProfit();
            total += itemProfit;
        }
        return total;
    }
}
