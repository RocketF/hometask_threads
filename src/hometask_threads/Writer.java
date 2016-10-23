package hometask_threads;



import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by rocketf on 23.10.16.
 */
public class Writer {

    static String[] Writer () {
        String[] mail = new String[3];

        mail[0] = randomTitle();
        mail[1] = randomTime().toString();
        mail[2] = randomText();
        return mail;
    }
     static String randomTitle(){
        String[] title = {"info", "error", "question", "todo"};
        Random ran = new Random();
       String wTitle = title[ran.nextInt(2)];
    return wTitle;
    }
    static Long randomTime(){
        Random ran = new Random();
        Date date = new Date();
        Long time = date.getTime();
        Long t = time - ran.nextInt(100);
        return t;
    }
    static String randomText(){
        String s = UUID.randomUUID().toString();
        return s;
    }
}
