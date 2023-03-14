package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quang
 */
public class Cart {
    private List<Items> cart;

    public Cart() {
        cart = new ArrayList<>();
    }
    public void addItems(Items item) {
        if (cart.contains(item)) {
            Items hang = cart.get(cart.indexOf(item));
            hang.setAmmout(hang.getAmmout() + item.getAmmout());
        } else {
            cart.add(item);
        }
    }
    public double  getThanhTien() {
        double tong = 0;
        for (Items item : cart) {
            tong += item.getPrice();
        }
        return tong;
    } 
}
