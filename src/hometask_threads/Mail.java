package hometask_threads;

/**
 * Created by rocketf on 27.10.16.
 */
public class Mail implements Write {
    @Override
    public Object getText() {
        return new RandomText();
    }
}
