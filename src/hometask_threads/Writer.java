package hometask_threads;



import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by rocketf on 23.10.16.
 */
public class Writer {

    static StringBuilder Writer () {
        StringBuilder mail = new StringBuilder();
        mail.append(randomTitle());
        mail.append(randomTime().toString());
        mail.append(randomText());
        return mail;
    }
     static String randomTitle(){
        String[] title = {"info", "error", "question", "todo"};
        Random ran = new Random();
       String wTitle = title[ran.nextInt(2)];
    return wTitle;
    }
    static Long randomTime(){            //TODO переписать метод new SimpleDateFormat ...formatDate.c.getTime()
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
    Queue q = new Queue(10);



}
