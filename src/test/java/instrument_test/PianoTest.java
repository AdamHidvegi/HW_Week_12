package instrument_test;

import instrument.Piano;
import org.junit.Before;
import org.junit.Test;
import shop_item.InstrumentType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(88, "black", "metal", InstrumentType.KEYBOARD, 30, 40);
    }

    @Test
    public void getKeys() {
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void getColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("metal", piano.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void play() {
        assertEquals("Hi, I'm a piano.", piano.play());
    }

    @Test
    public void getMarkup() {
        assertEquals(0.33, piano.calculateMarkup(), 0.01);
    }

}