package hometask_threads;

import java.util.*;

/**
 * Created by rocketf on 27.10.16.
 */
public class RandomText {
      public String getText() {
      StringBuilder string = new StringBuilder();
          string.append(randomTitle());
          string.append(" ");
          string.append(randomTime());
          string.append(" ");
          string.append(randomText());
          return  string.toString();
      }
    static String randomTitle() {
        String[] title = {"info", "error", "question", "todo"};
        Random ran = new Random();
        String wTitle = title[ran.nextInt(4)];
        return wTitle;
    }
    static String randomTime() {     //milliseconds
        Random random = new Random();
        GregorianCalendar cal = new GregorianCalendar(2016, Calendar.SEPTEMBER, 20);
        cal.add(Calendar.MONTH, random.nextInt(10));
        Long i = cal.getTimeInMillis();
        return i+" ";
    }
    static String randomText(){
        String s = UUID.randomUUID().toString();
        return s;
    }
}
