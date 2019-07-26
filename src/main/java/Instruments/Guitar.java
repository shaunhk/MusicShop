package Instruments;

import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(double sellingPrice, double buyingprice, InstrumentType type, InstrumentColour colour, InstrumentMake make, int strings) {
        super(sellingPrice, buyingprice, type, colour, make);
        this.strings = strings;
    }

    public String play(){
        return "Pling plong";
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
}
