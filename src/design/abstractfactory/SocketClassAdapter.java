package design.abstractfactory;

public class SocketClassAdapter extends Socket implements SocketAdapter{


    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get65Volt() {
        Volt    volt = getVolt();
        return convertVolt(volt,1.8);
    }

    @Override
    public Volt get18Volt() {
        Volt volt = getVolt();
        return convertVolt(volt,6.6);
    }


    private Volt convertVolt(Volt volt,double value){
            return new Volt(volt.getVolts()/value);
    }
}
