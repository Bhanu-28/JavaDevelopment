package design.creational.singleton;

public class ThreadSafeSingleton {

    /*
    make the global access method synchronized
    so that only one thread can execute this method at a time.
     */
    private static ThreadSafeSingleton instance;


    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            return new ThreadSafeSingleton();
        }
        return instance;
    }

    /*
     but it reduces the performance because of the cost associated
     with the synchronized method, although we need it only for the
     first few threads that might create separate instances.
     */
}
