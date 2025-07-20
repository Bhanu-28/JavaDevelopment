package design.creational.singleton;

public class DoubleCheckThreadSafeSingleton {

    /*
       the synchronized block is used inside the if condition
       with an additional check to ensure that only one instance
       of a singleton class is created.
     */
    private static DoubleCheckThreadSafeSingleton instance;


    private DoubleCheckThreadSafeSingleton(){}

    public static  DoubleCheckThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckThreadSafeSingleton.class){
                instance =  new DoubleCheckThreadSafeSingleton();
            }
        }
        return instance;
    }

}
