package Instruments;

import Behaviours.IPlay;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;
import OtherAbstractClasses.Sell;

public abstract class Instrument extends Sell implements IPlay {

    private InstrumentType type;
    private InstrumentColour colour;
    private InstrumentMake make;

    public Instrument(double sellingPrice, double buyingPrice, InstrumentType type, InstrumentColour colour, InstrumentMake make) {
        super(sellingPrice, buyingPrice);
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
