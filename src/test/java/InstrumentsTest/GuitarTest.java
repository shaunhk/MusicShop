package InstrumentsTest;

import Instruments.Enums.*;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(100, 30, InstrumentType.STRING, InstrumentColour.BLACK, InstrumentMake.GIBSON, 6);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(100, guitar.getSellingprice(), 0.01);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(30, guitar.getBuyingprice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice() {
        guitar.setBuyingprice(120.33);
        assertEquals(120.33, guitar.getBuyingprice(), 0.01);
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
