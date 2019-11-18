package shop_test;

import org.junit.Before;
import org.junit.Test;
import shop_item.InstrumentType;
import shop_item.PianoKey;

import static org.junit.Assert.assertEquals;

public class PianoKeyTest {

    PianoKey pianoKey;

    @Before
    public void before() {
        pianoKey = new PianoKey(InstrumentType.KEYBOARD, 30, 50);
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, pianoKey.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(30, pianoKey.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(50, pianoKey.getSellingPrice(), 0.01);
    }

    @Test
    public void getMarkup() {
        assertEquals(0.66, pianoKey.calculateMarkup(), 0.01);
    }

}