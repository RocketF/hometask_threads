package hometask_threads;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by rocketf on 23.10.16.
 */
public class Basket {                        //сорировочные корзины
    TreeMap basket;
    public TreeMap Basket(){
         this.basket = new TreeMap();
        return basket;
    }

    public interface myComparator extends Comparable {   //TODO:сортировать по дате,которую извлекать matcher'ом

    }
}
