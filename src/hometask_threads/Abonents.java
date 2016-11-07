package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */

    public class Abonents extends Thread {                 //абоненты

    public void run(String w){
      Object data =  Factory.getMessage(w).getText();

    }
}