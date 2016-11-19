package hometask_threads;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rocketf on 24.10.16.
 */
public class ThreadSort extends Thread{                           //сортировщик
    String p1 = "i.+";
    String p2 = "e.+";
    String p3 = "q.+";
    Queue q;
    ThreadSort(Queue q){
        this.q = q;
    }
    public void run() {
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();
        Basket b4 = new Basket();
        String s = new String();
        while (q.size() > 0) {
            s = q.take();
            System.out.println(s);
            if (check(p1, s)){
                System.out.println("true1");
                b1.basket.add(s);
                continue;
            } else if (check(p2, s)) {
                System.out.println("true2");
                b2.basket.add(s);
                continue;
            } else if (check(p3, s)) {
                System.out.println("true3");
                b3.basket.add(s);
                continue;
            }
            System.out.println("true4");
            b4.basket.add(s);
        }
    }
    private boolean check(String p,String s ){
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        return m.matches();
    }
}
