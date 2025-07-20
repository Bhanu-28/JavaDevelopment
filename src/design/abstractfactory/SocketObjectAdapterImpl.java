package design.abstractfactory;

public class SocketObjectAdapterImpl implements SocketAdapter{

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get65Volt() {
        Volt volt = sock.getVolt();
        return convertVolt(volt,1.8);
    }

    @Override
    public Volt get18Volt() {
        Volt volt = sock.getVolt();
        return convertVolt(volt,6.6);
    }

    private Volt convertVolt(Volt volt , double value){
        return new Volt(volt.getVolts()/value);
    }

}
