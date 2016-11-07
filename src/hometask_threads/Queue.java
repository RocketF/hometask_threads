package hometask_threads;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by rocketf on 24.10.16.
 */
public class Queue {                        //очередь
    private ArrayList<TreeMap> queue =new ArrayList<TreeMap>();

    public void insert (TreeMap element){
        queue.add(element);
    }

    public TreeMap take(){
        Integer n = queue.size();
        TreeMap tmp = new TreeMap();
        tmp = queue.get(n);
        queue.remove(n);
        return tmp;
    }
}
