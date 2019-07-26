package OtherAbstractClasses;

public abstract class Sell {

    private double sellingPrice;
    private double buyingPrice;

    public Sell(double sellingPrice, double buyingPrice){
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getProfit(){
        return this.sellingPrice - this.buyingPrice;
    }
}
