package instrument_test;

import instrument.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop_item.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(4, "black", "metal", InstrumentType.STRING, 30, 40);
    }

    @Test
    public void getStrings() {
        assertEquals(4, guitar.getNumOfStrings());
    }

    @Test
    public void getColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("metal", guitar.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void play() {
        assertEquals("Hi, I'm a guitar.", guitar.play());
    }

    @Test
    public void getMarkup() {
        assertEquals(0.33, guitar.calculateMarkup(), 0.01);
    }

}