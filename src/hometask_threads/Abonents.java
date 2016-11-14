package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */

    public class Abonents extends Thread {
    String s;
    Queue q ;
    Abonents(String s, Queue q){
        this.s = s;
        this.q = q;
    }
    public void run(){
      Object data =  Factory.getMessage(s).getText();
        q.insert(data.toString());
    }
}