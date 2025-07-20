package design.abstractfactory.adapter;

import design.abstractfactory.Volt;

public class SocketExtender extends SocketAdapterAbstract {
    @Override
    public Volt get120Volt() {
        return new Volt(120);
    }

    @Override
    public Volt get65Volt() {
        return new Volt(65);
    }
}
