package hometask_threads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rocketf on 24.10.16.
 */
public class ThreadSort extends Thread{                           //сортировщик
    Queue q;
    Basket basket;
    String p = "^info$";
    String p2 = "^error$";
    String p3 = "^question$";
    String p4 = "^todo$";
    public void run(){
       String s = this.q.get();              //TODO: передавать в нужные корзины;прокидывать исключения
        if(check(p,s)){
            System.out.println(new Basket(s));

    }
}

    public static boolean check(String p,String s ){
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        return m.matches();
    }
}
