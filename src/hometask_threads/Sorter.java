package hometask_threads;

/**
 * Created by rocketf on 23.10.16.
 */
public class Sorter {
private Sorter(){
    new ThreadSort().run();
}
    private static class SorterHolder{
        private static final Sorter INSTANCE = new Sorter();
    }
    public static Sorter getInstance(){
        return SorterHolder.INSTANCE;
    }
}



   /* private static Sorter instance;
    static Sorter getInstance(){
        if(instance ==null){
            instance = new Sorter();
        }return instance;
    }
    public void Sorter(){
      new ThreadSort().run();
    }*/

