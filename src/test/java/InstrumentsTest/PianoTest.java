package InstrumentsTest;

import Instruments.Enums.*;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(999.99, 500, InstrumentType.STRING, InstrumentColour.BLACK, InstrumentMake.YAMAHA, 60);
    }

    @Test
    public void getSellingprice() {
        assertEquals(999.99, piano.getSellingprice(), 0.01);
    }

    @Test
    public void getBuyingprice() {
        assertEquals(500, piano.getBuyingprice(), 0.01);
    }

    @Test
    public void setBuyingprice() {
        piano.setBuyingprice(1200);
        assertEquals(1200, piano.getBuyingprice(), 0.01);
    }

    @Test
    public void getProfit() {
        assertEquals(499.99, piano.getProfit(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plink", piano.play());
    }

    @Test
    public void hasKeys(){
        assertEquals(60, piano.getNumberOfKeys());
    }
}