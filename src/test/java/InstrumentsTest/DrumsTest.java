package InstrumentsTest;

import Instruments.Drums;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void setUp() {
        drums = new Drums(150, 40, InstrumentColour.WHITE, InstrumentMake.FENDER, 12);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(150, drums.getSellingPrice(), 0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(40, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void setBuyingPrice() {
        drums.setBuyingPrice(130.25);
        assertEquals(130.25, drums.getBuyingPrice(), 0.01);
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