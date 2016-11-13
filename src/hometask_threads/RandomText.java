package hometask_threads;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by rocketf on 27.10.16.
 */
public class RandomText {
      public  RandomText() {
      StringBuilder string = new StringBuilder();
          string.append(randomTitle());
          string.append("time");
          string.append(randomTime());
          string.append("timeEnd");
          string.append(randomText());
          System.out.println("text created");
}
    static String randomTitle() {
        String[] title = {"info", "error", "question", "todo"};
        Random ran = new Random();
        String wTitle = title[ran.nextInt(2)];
        return wTitle;
    }
    static String randomTime() {            //TODO: переписать метод new SimpleDateFormat ...formatDate.c.getTime()
        Random ran = new Random();
        Date date = new Date();
        Long time = date.getTime();
        Long t = time - ran.nextInt(100);
        String s = t.toString();
        return s;
    }
    static String randomText(){
        String s = UUID.randomUUID().toString();
        return s;
    }
}
