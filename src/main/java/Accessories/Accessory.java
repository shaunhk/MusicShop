package Accessories;

import Accessories.AccessoryEnums.AccessoryType;
import OtherAbstractClasses.Sell;

public abstract class Accessory extends Sell {

    private AccessoryType type;

    public Accessory(double sellingPrice, double buyingPrice) {
        super(sellingPrice, buyingPrice);
    }
}
