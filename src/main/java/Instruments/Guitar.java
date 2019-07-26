package Instruments;

import Instruments.Enums.*;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(double sellingprice, double buyingprice, InstrumentType type, InstrumentColour colour, InstrumentMake make, int strings) {
        super(sellingprice, buyingprice, type, colour, make);
        this.strings = strings;
    }

    public String play(){
        return "Pling plong";
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
}
