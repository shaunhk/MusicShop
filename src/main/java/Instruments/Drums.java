package Instruments;

import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;

public class Drums extends Instrument {

    private int drums;
    private InstrumentType type;

    public Drums(double sellingprice, double buyingprice, InstrumentColour colour, InstrumentMake make, int drums) {
        super(sellingprice, buyingprice, colour, make);
        this.type = InstrumentType.PERCUSSION;
        this.drums = drums;
    }

    public String play() {
        return "Bum Tiss";
    }

    public int getNumberOfDrums() {
        return this.drums;
    }

    public InstrumentType getType() {
        return type;
    }
}
