package Instruments;

import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;

public class Drums extends Instrument {

    private int drums;

    public Drums(double sellingprice, double buyingprice, InstrumentType type, InstrumentColour colour, InstrumentMake make, int drums) {
        super(sellingprice, buyingprice, type, colour, make);
        this.drums = drums;
    }

    public String play() {
        return "Bum Tiss";
    }

    public int getNumberOfDrums() {
        return this.drums;
    }
}
