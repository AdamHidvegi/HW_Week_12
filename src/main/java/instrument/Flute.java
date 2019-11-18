package instrument;

import shop_item.InstrumentType;

public class Flute extends Instrument {

    private int numOfKeys;

    public Flute(int numOfKeys, String colour, String material, InstrumentType type, double boughtPrice, double sellPrice) {

        super(colour, material, type, boughtPrice, sellPrice);
        this.numOfKeys = numOfKeys;

    }

    public String play() {
        return "Hi, I'm a flute.";
    }

    public int getNumOfKeys() {
        return this.numOfKeys;
    }

}