package hometask_threads;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rocketf on 24.10.16.
 */
public class ThreadSort extends Thread{                           //сортировщик
    Queue q = new Queue();
    String p1 = "^info$";
    String p2 = "^error$";
    String p3 = "^question$";
    String p4 = "^todo$";
    public void run(){
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();
        Basket b4 = new Basket();
       TreeMap s = new TreeMap();     //TODO: передавать в нужные корзины;прокидывать исключения
        s = this.q.take();
        if(check(p1,s.get(1).toString())){
            //b1.basket.put(1,s);
            System.out.println("work");


    }
}

    public static boolean check(String p,String s ){
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        return m.matches();
    }
}
