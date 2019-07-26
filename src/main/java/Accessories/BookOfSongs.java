package Accessories;

import Accessories.AccessoryEnums.AccessoryType;

public class BookOfSongs extends Accessory {

    private AccessoryType type;

    public BookOfSongs(double sellingPrice, double buyingPrice) {
        super(sellingPrice, buyingPrice);
        this.type = AccessoryType.SHEETMUSIC;
    }

    public AccessoryType getType() {
        return type;
    }
}
