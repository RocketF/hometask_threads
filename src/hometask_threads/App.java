package hometask_threads;

import java.util.Random;

/**
 * Created by rocketf on 23.10.16.
 */
public class App {
    public static void main (String[] args){
        Queue queue = new Queue();
        queue.insert(new Abonents().run("start"));
        Sorter.getInstance();
    }
}
