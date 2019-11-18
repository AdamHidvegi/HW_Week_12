package shop_test;

import org.junit.Before;
import org.junit.Test;
import shop_item.GuitarPick;
import shop_item.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {

    GuitarPick guitarPick;

    @Before
    public void before() {
        guitarPick = new GuitarPick(InstrumentType.STRING, 30, 50);
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.STRING, guitarPick.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(30, guitarPick.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(50, guitarPick.getSellingPrice(), 0.01);
    }

    @Test
    public void getMarkup() {
        assertEquals(0.66, guitarPick.calculateMarkup(), 0.01);
    }

}
