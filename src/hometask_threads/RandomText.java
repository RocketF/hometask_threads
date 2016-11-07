package hometask_threads;

import java.util.Date;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

/**
 * Created by rocketf on 27.10.16.
 */
public class RandomText {
      public TreeMap<Integer, String> RandomText() {
TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(1,randomTitle());
            treeMap.put(2,randomTime());
            treeMap.put(3,randomText());
            return treeMap;

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
