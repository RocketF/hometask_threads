package hometask_threads;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rocketf on 24.10.16.
 */
public class ThreadSort extends Thread{
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
            if (check(p1, s)){
                insertInBasket(b1,s,s.substring(5,18));
                continue;
            } else if (check(p2, s)) {
                insertInBasket(b2,s,s.substring(6,19));
                continue;
            } else if (check(p3, s)) {
                insertInBasket(b3,s,s.substring(9,22));
                continue;
            }
            insertInBasket(b4,s,s.substring(5,18));
        }System.out.println(b1.basket.values());
        System.out.println(b2.basket.values());
        System.out.println(b3.basket.values());
        System.out.println(b4.basket.values());

    }
    private boolean check(String p,String s ){
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        return m.matches();
    }
    private void insertInBasket(Basket b, String s, String sub){
        try {
       b.basket.put(Double.parseDouble(sub),s);
        }catch (ClassCastException e) {
        System.err.println("NumberFormatException");
    }
    }
}
