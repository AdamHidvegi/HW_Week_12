package instrument_test;

import instrument.Flute;
import org.junit.Before;
import org.junit.Test;
import shop_item.InstrumentType;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(16, "black", "metal", InstrumentType.WOODWIND, 30, 40);
    }

    @Test
    public void getKeys() {
        assertEquals(16, flute.getNumOfKeys());
    }

    @Test
    public void getColour() {
        assertEquals("black", flute.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("metal", flute.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void play() {
        assertEquals("Hi, I'm a flute.", flute.play());
    }

    @Test
    public void getMarkup() {
        assertEquals(0.33, flute.calculateMarkup(), 0.01);
    }

}