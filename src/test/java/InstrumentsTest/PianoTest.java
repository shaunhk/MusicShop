package InstrumentsTest;

import Instruments.Piano;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(999.99, 500, InstrumentColour.BLACK, InstrumentMake.YAMAHA, 60);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(999.99, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(500, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void setBuyingPrice() {
        piano.setBuyingPrice(1200);
        assertEquals(1200, piano.getBuyingPrice(), 0.01);
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