package Instruments;

import Instruments.Enums.*;

public class Piano extends Instrument {

    private int keys;

    public Piano(double sellingprice, double buyingprice, InstrumentType type, InstrumentColour colour, InstrumentMake make, int keys) {
        super(sellingprice, buyingprice, type, colour, make);
        this.keys = keys;
    }

    public String play() {
        return "Plink plink";
    }

    public int getNumberOfKeys() {
        return this.keys;
    }
}
