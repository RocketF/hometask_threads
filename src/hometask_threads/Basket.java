package hometask_threads;

import java.util.Map;
import java.util.TreeSet;

/**
 * Created by rocketf on 23.10.16.
 */
public class Basket {
    Writer w;
    public TreeSet putIntoBasket(Writer w){
        this.w = w;
        TreeSet bas = new TreeSet();
        bas.add(w);
        return bas;
    }
public Basket b1 = new Basket();
//// TODO: метод запихивания в корзину
}
