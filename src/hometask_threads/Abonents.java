package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */

    public class Abonents extends Thread {                 //абоненты
    Writer writer;

    Abonents(Writer writer) {
        this.writer = writer;
    }
    public void run(){
        writer.q.insert(writer.toString());
        System.out.println(Thread.currentThread().getName());
    }
}