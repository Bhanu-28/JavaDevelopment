package design.creational.singleton;

public class EagerInitializedSingleton {

        /*
        The drawback to eager initialization is that the method is
        created even though the client application might not be using it.
        Here is the implementation of the static initialization singleton class
        */

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

        private EagerInitializedSingleton(){
            // private constructor to avoid client applications using the constructor.

        }

        public static EagerInitializedSingleton getInstance(){
            return instance;
        }
}
