package shop_item;

import behaviours.ISell;

public abstract class ShopItem implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public ShopItem(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkup() {
        return ((this.sellingPrice - this.buyingPrice)/this.buyingPrice);
    }

}
