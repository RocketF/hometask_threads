package hometask_threads;

/**
 * Created by rocketf on 24.10.16.
 */
public class Queue {                        //очередь
    private String[] queue;
    private int maxSize;
    private int totalElemens;
    private int first;
    private int last;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        queue = new String[maxSize];
        last = -1;
        //first = 0;
        totalElemens = 0;
    }
    public void insert(String element){
        if(last==maxSize-1){
            last=-1;
        }
        queue[++last] = element;
        totalElemens++;
        System.out.println(element.toString());
    }
    public String get(){
        return queue[totalElemens--];
    }

}
