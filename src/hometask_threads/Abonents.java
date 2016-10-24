package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */

    public class Abonents extends Thread {
    Writer writer;

    Abonents(Writer writer) {
        this.writer = writer;
    }
    public void run(){
        writer.q.insert(writer.toString());
        System.out.println(Thread.currentThread().getName());
    }

   /* public void run() {

        if (writer.randomTitle().equals("info")) {
            System.out.println("1");
        } else if (writer.randomTitle().equals("error")) {
            System.out.println("2");

        } else if (writer.randomTitle().equals("question")) {
            System.out.println("3");

        } else {
            System.out.println("4");

        }
    } */

}