import Accessories.FullPackGuitarStrings;
import Instruments.Guitar;
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
//        guitar = new Guitar(250, 180)
    }

    @Test
    public void getStockAmount() {
    }

    @Test
    public void addStock() {
    }

    @Test
    public void removeStock() {
    }
}