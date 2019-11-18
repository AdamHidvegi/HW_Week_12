package shop_item;

public class Accessory extends ShopItem {

    private InstrumentType type;

    public Accessory(InstrumentType type, double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return this.type;
    }

}
