package hometask_threads;

import java.util.Random;

/**
 * Created by rocketf on 23.10.16.
 */
public class App {
    public static void main (String[] args){
        Queue q = new Queue();
        new Abonents("start",q).start();
        new Abonents("start",q).start();
        Sorter.getInstance();
    }

}
