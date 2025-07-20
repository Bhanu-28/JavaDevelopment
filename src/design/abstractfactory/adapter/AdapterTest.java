package design.abstractfactory.adapter;

import design.abstractfactory.Volt;

public class AdapterTest {

    public static void main(String[] args) {

        // Create an instance of SocketExtender
        SocketAdapter socket = new SocketExtender();

        // Use only the methods you have implemented
        Volt v120 = socket.get120Volt();
        Volt v65 = socket.get65Volt();
        Volt v18 = socket.get18Volt(); // Will return null because not implemented

        System.out.println("120V : " + (v120 != null ? v120.getVolts() : "Not available"));
        System.out.println("65V  : " + (v65 != null ? v65.getVolts(): "Not available"));
        System.out.println("18V  : " + (v18 != null ? v18.getVolts(): "Not available"));
    }
}
