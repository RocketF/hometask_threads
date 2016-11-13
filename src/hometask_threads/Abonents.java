package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */

    public class Abonents extends Thread {
    String s;
    Abonents(String s){
        this.s = s;
    }
    public void run(){
      Object data =  Factory.getMessage(s).getText();
        Queue q = new Queue();
        q.insert(data.toString());
    }
}