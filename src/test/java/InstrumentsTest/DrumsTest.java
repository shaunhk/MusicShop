package InstrumentsTest;

import Instruments.Drums;
import Instruments.Enums.InstrumentColour;
import Instruments.Enums.InstrumentMake;
import Instruments.Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void setUp() {
        drums = new Drums(150, 40, InstrumentType.PERCUSSION, InstrumentColour.WHITE, InstrumentMake.FENDER, 12);
    }

    @Test
    public void getSellingprice() {
        assertEquals(150, drums.getSellingprice(), 0.01);
    }

    @Test
    public void getBuyingprice() {
        assertEquals(40, drums.getBuyingprice(), 0.01);
    }

    @Test
    public void setBuyingprice() {
        drums.setBuyingprice(130.25);
        assertEquals(130.25, drums.getBuyingprice(), 0.01);
    }

    @Test
    public void getProfit() {
        assertEquals(110, drums.getProfit(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Bum Tiss", drums.play());
    }

    @Test
    public void getNumberOfDrums(){
        assertEquals(12, drums.getNumberOfDrums());
    }
}