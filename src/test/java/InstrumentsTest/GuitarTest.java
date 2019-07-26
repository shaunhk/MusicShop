package InstrumentsTest;

import Instruments.Guitar;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(100, 30, InstrumentColour.BLACK, InstrumentMake.GIBSON, 6);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(100, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(30, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        guitar.setBuyingPrice(120.33);
        assertEquals(120.33, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetProfit() {
        assertEquals(70, guitar.getProfit(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Pling plong", guitar.play());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
}
