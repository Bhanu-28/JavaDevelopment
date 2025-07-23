package design.creational.singleton;

import java.io.*;

public class TestSerializedSingletonReadResolve {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    SerializedSingletonReadResolve instanceOne = SerializedSingletonReadResolve.getInstance();

        // Serialize the object to file.
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("serializable.ser"));

        objectOutput.writeObject(instanceOne);

        //Serialize the file to object.

        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("serializable.ser"));

        SerializedSingletonReadResolve instanceTwo = (SerializedSingletonReadResolve)objectInput.readObject();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
