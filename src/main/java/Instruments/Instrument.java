package Instruments;

import Behaviours.IPlay;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import OtherAbstractClasses.Sell;

public abstract class Instrument extends Sell implements IPlay {

    private InstrumentColour colour;
    private InstrumentMake make;

    public Instrument(double sellingPrice, double buyingPrice, InstrumentColour colour, InstrumentMake make) {
        super(sellingPrice, buyingPrice);
        this.colour = colour;
        this.make = make;
    }

    public InstrumentColour getColour() {
        return colour;
    }

    public InstrumentMake getMake() {
        return make;
    }
}
