package Instruments;

import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;

public class Piano extends Instrument {

    private int keys;
    private InstrumentType type;

    public Piano(double sellingprice, double buyingprice, InstrumentColour colour, InstrumentMake make, int keys) {
        super(sellingprice, buyingprice, colour, make);
        this.type = InstrumentType.STRING;
        this.keys = keys;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public String play() {
        return "Plink plink";
    }

    public int getNumberOfKeys() {
        return this.keys;
    }
}
