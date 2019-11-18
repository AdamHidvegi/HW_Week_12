import instrument.Flute;
import instrument.Guitar;
import instrument.Piano;
import org.junit.Before;
import org.junit.Test;
import shop_item.GuitarPick;
import shop_item.InstrumentType;
import shop_item.PianoKey;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Guitar guitar;
    Flute flute;
    GuitarPick guitarPick;
    PianoKey pianoKey;

    @Before
    public void before() {
        shop = new Shop();
        pianoKey = new PianoKey(InstrumentType.KEYBOARD, 30, 50);
        guitarPick = new GuitarPick(InstrumentType.STRING, 30, 50);
        flute = new Flute(16, "black", "metal", InstrumentType.WOODWIND, 30, 40);
        guitar = new Guitar(4, "black", "metal", InstrumentType.STRING, 30, 40);
        piano = new Piano(88, "black", "metal", InstrumentType.KEYBOARD, 30, 40);
    }

    @Test
    public void getStockSize() {
        assertEquals(0, shop.stockSize());
    }

    @Test
    public void addItem() {
        shop.addItemToStock(piano);
        shop.addItemToStock(guitar);
        assertEquals(2, shop.stockSize());
    }

    @Test
    public void removeItem() {
        shop.addItemToStock(piano);
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(1, shop.stockSize());
    }

    @Test
    public void totalProfit() {
        shop.addItemToStock(piano);
        shop.addItemToStock(guitar);
        shop.addItemToStock(flute);
        shop.addItemToStock(pianoKey);
        shop.addItemToStock(guitarPick);
        assertEquals(2.33, shop.totalProfit(), 0.01);
    }

}
