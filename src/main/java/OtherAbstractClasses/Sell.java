package OtherAbstractClasses;

public abstract class Sell {

    private double sellingprice;
    private double buyingprice;

    public Sell(double sellingprice, double buyingprice){
        this.sellingprice = sellingprice;
        this.buyingprice = buyingprice;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public double getBuyingprice() {
        return buyingprice;
    }

    public void setBuyingprice(double buyingprice) {
        this.buyingprice = buyingprice;
    }

    public double getProfit(){
        return this.sellingprice - this.buyingprice;
    }
}
