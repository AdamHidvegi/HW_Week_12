package instrument;

import behaviours.IPlay;
import shop_item.InstrumentType;
import shop_item.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay{

    private String colour;
    private String material;
    private InstrumentType type;

    public Instrument(String colour, String material, InstrumentType type, double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }

    public InstrumentType getType() {
        return this.type;
    }

}
