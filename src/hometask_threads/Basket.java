package hometask_threads;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by rocketf on 23.10.16.
 */
public class Basket {                        //сорировочные корзины
    ArrayList basket;

    public Basket() {
        this.basket = new ArrayList<String>();
    }

    public String sortBasket(Basket b) {
        for (int n = 0; n < b.basket.size(); n++) {
            b.basket.get(n);
            System.out.println(b.basket.get(n));
        }
        return "корзина" + "отсортирована";
    }

    private
}
