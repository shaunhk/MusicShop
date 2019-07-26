import Accessories.FullPackGuitarStrings;
import Instruments.Guitar;
import Instruments.InstrumentsEnums.InstrumentColour;
import Instruments.InstrumentsEnums.InstrumentMake;
import Instruments.InstrumentsEnums.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private FullPackGuitarStrings strings;

    @Before
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar(480, 320, InstrumentColour.WHITE, InstrumentMake.FENDER, 12);
        piano = new Piano(1200, 920, InstrumentColour.BLACK, InstrumentMake.YAMAHA, 120);
        strings = new FullPackGuitarStrings(3.99, 1);
    }

    @Test
    public void getStockAmount() {
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void addStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void removeStock() {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockAmount());
    }
}