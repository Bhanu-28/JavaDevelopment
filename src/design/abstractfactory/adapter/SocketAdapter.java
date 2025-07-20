package design.abstractfactory.adapter;

import design.abstractfactory.Volt;

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get65Volt();

    public Volt get18Volt();

}
