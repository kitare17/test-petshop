package model.entity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quang
 */
public class Cart {
    private List<Items> cart;
    DecimalFormat formatter = new DecimalFormat("#,###,###");


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
    public String getThanhTienString() {
        return formatter.format(getThanhTien());

    }
    public List<Items> getCart() {
        return cart;
    }

//    public void setCart(List<Items> cart) {
//        this.cart = cart;
//    }
   
}
