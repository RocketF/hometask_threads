package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */
public class Sorter {
    private static Sorter ourInstance = new Sorter();

    public static Sorter getInstance() {
        return ourInstance;
    }

    private Sorter() {
    }
}
