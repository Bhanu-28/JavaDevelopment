package design.abstractfactory.adapter;

import design.abstractfactory.Volt;

abstract class SocketAdapterAbstract implements SocketAdapter {

    public Volt get120Volt(){
        return null;
    };

    public  Volt get65Volt(){
        return null;
    };

    public Volt get18Volt(){
        return null;
    };

}
