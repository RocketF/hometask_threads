package hometask_threads;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rocketf on 24.10.16.
 */
public class ThreadSort extends Thread{                           //сортировщик
    String p1 = "^info$";
    String p2 = "^error$";
    String p3 = "^question$";
    //String p4 = "^todo$";
    public void run(Queue q ) {
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();
        Basket b4 = new Basket();
        TreeMap s = new TreeMap();
        while (q.size() > 0) {
            s = q.take();
            if (check(p1, s.get(1).toString())) {
                b1.basket.add(s);        //// TODO:
            } else if (check(p2, s.get(1).toString())) {
                b2.basket.add(s);
            } else if (check(p3, s.get(1).toString())) {
                b3.basket.add(s);
            }
            b4.basket.add(s);

        }
    }
    public static boolean check(String p,String s ){
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        return m.matches();
    }
}
