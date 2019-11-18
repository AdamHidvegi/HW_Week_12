import behaviours.ISell;
import shop_item.ShopItem;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int stockSize() {
        return this.stock.size();
    }

    public void addItemToStock(ShopItem shopitem) {
        this.stock.add(shopitem);
    }

    public void removeItemFromStock(ShopItem shopitem) {
        this.stock.remove(shopitem);
    }

    public double totalProfit() {
        double result = 0;
        for (ISell item : this.stock) {
            result += item.calculateMarkup();
        }
        return result;
    }

}
