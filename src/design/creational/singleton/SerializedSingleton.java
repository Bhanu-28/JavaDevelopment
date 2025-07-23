package design.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionId = 1L;
    private SerializedSingleton(){}

    private static class SerializedSingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SerializedSingletonHelper.instance;
    }

/*
    The problem with serialized singleton class is that
    whenever we deserialize it, it will create a new instance of the class.
*/


}
