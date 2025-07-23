package design.creational.singleton;

import java.io.Serializable;

public class SerializedSingletonReadResolve implements Serializable {

    private static final long serialVersionId = 1L;
    private SerializedSingletonReadResolve(){

    }

    private static class SerializedSingletonHelper{
        private static final SerializedSingletonReadResolve instance = new SerializedSingletonReadResolve();
    }

    public static SerializedSingletonReadResolve getInstance(){
        return SerializedSingletonHelper.instance;
    }


    protected Object readResolve(){
        return SerializedSingletonHelper.instance;
    }

/*
    The problem with serialized singleton class is that
    whenever we deserialize it, it will create a new instance of the class.
*/


}
