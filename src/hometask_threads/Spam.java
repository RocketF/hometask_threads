package hometask_threads;

/**
 * Created by rocketf on 27.10.16.
 */
public class Spam implements Write{
    @Override
    public Object getText() {
        System.out.println("SPAM!!!");
        return 12;
    }
}
