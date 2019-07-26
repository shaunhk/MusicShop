package Accessories;

import Accessories.AccessoryEnums.AccessoryType;

public class FullPackGuitarStrings extends Accessory {

    private AccessoryType type;

    public FullPackGuitarStrings(double sellingPrice, double buyingPrice) {
        super(sellingPrice, buyingPrice);
        this.type = AccessoryType.GUITARSTRINGS;
    }

    public AccessoryType getType() {
        return this.type;
    }
}
