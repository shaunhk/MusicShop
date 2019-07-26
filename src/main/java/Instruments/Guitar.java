package Instruments;

import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;

public class Guitar extends Instrument {

    private int strings;
    private InstrumentType type;

    public Guitar(double sellingPrice, double buyingPrice, InstrumentColour colour, InstrumentMake make, int strings) {
        super(sellingPrice, buyingPrice, colour, make);
        this.type = InstrumentType.STRING;
        this.strings = strings;
    }

    public String play(){
        return "Pling plong";
    }

    public int getNumberOfStrings() {
        return this.strings;
    }

    public InstrumentType getType() {
        return  this.type;
    }
}
