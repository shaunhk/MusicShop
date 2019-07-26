package AccessoriesTest;

import Accessories.AccessoryEnums.AccessoryType;
import Accessories.BookOfSongs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookOfSongsTest {

    private BookOfSongs book;

    @Before
    public void setUp() {
        this.book = new BookOfSongs(10, 5);
    }

    @Test
    public void getType() {
        assertEquals(AccessoryType.SHEETMUSIC, book.getType());
    }
}