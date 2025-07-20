package design.creational.singleton;

public class StaticBlockSingleton {


    private StaticBlockSingleton(){
        // private constructor to avoid client applications using the constructor.

    }

    private static StaticBlockSingleton instance;
        /*
        similar to eager initialization, except that instance of the class is
         created in the static block that provides the option for exception handling.

        */

    static {
        try{
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

        public static StaticBlockSingleton getInstance(){
            return instance;
        }
}
