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
}
