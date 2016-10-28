package hometask_threads;

/**
 * Created by rocketf on 28.10.16.
 */
public class Factory {
    public static Write getMessage(String mode){
        if(mode.equals("start")){
            return new Mail();
        }else {return new Spam();}
    }
}
