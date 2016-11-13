package hometask_threads;

import java.util.Random;

/**
 * Created by rocketf on 23.10.16.
 */
public class App {
    public Queue queue = new Queue();
    public static void main (String[] args){
        //Queue queue = new Queue();
        new Abonents("start").start();
        Sorter.getInstance();
    }

}
