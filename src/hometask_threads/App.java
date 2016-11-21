package hometask_threads;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by rocketf on 23.10.16.
 */
public class App {
    public static void main (String[] args){
        Queue q = new Queue();
        int i =0;
        while (i<20){
        new Abonents("start",q).start();
        i++;
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Sorter.getInstance();
        new ThreadSort(q).start();
    }

}
