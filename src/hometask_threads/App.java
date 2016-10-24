package hometask_threads;

import java.util.Random;

/**
 * Created by rocketf on 23.10.16.
 */
public class App {
    public static void main (String[] args){


        Writer w1 = new Writer();
        Writer w2 = new Writer();
        Writer w3 = new Writer();
        Writer w4 = new Writer();
        Writer w5 = new Writer();
        Writer w6 = new Writer();
        new Abonents(w1).start();
        new Abonents(w2).start();
        new Abonents(w3).start();
        new Abonents(w4).start();
        new Abonents(w5).start();
        new Abonents(w6).start();


    }
}
