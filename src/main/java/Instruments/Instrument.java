package Instruments;

import Behaviours.IPlay;
import Instruments.Enums.InstrumentColour;
import Instruments.Enums.InstrumentMake;
import Instruments.Enums.InstrumentType;
import OtherAbstractClasses.Sell;

public abstract class Instrument extends Sell implements IPlay {

    private InstrumentType type;
    private InstrumentColour colour;
    private InstrumentMake make;

    public Instrument(double sellingprice, double buyingprice, InstrumentType type, InstrumentColour colour, InstrumentMake make) {
        super(sellingprice, buyingprice);
        this.type = type;
        this.colour = colour;
        this.make = make;
    }

    public InstrumentType getType() {
        return type;
    }

    public InstrumentColour getColour() {
        return colour;
    }

    public InstrumentMake getMake() {
        return make;
    }
}
