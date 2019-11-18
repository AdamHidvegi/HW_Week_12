package instrument;

import shop_item.InstrumentType;

public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(int numOfStrings, String colour, String material, InstrumentType type, double boughtPrice, double sellPrice) {

        super(colour, material, type, boughtPrice, sellPrice);
        this.numOfStrings = numOfStrings;

    }

    public String play() {
        return "Hi, I'm a guitar.";
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

}
