package hometask_threads;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by rocketf on 24.10.16.
 */
public class Queue {                        //очередь
    private ArrayList<String> queue = new ArrayList<String>();

    public void insert (String element){
        queue.add(element);
    }
    public String take(){
        Integer n = queue.size();
        String s = queue.get(n);
        queue.remove(n);
        return s;
    }
    public Integer size(){
        Integer i = queue.size();
        return i;
    }
}
