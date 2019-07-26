package AccessoriesTest;

import Accessories.AccessoryEnums.AccessoryType;
import Accessories.FullPackGuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullPackGuitarStringsTest {

    private FullPackGuitarStrings strings;

    @Before
    public void setUp() {
        strings = new FullPackGuitarStrings(4, 0.50);
    }

    @Test
    public void getType() {
        assertEquals(AccessoryType.GUITARSTRINGS, strings.getType());
    }
}