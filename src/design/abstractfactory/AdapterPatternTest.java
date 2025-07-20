package design.abstractfactory;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketObjectAdapterImpl socketObjectAdapter = new SocketObjectAdapterImpl();

        Volt volt = getVolt(socketObjectAdapter,65);
        Volt volt1 = getVolt(socketObjectAdapter,120);
        Volt volt2 = getVolt(socketObjectAdapter,18);
        System.out.println("Mobile charger  : "+volt2.getVolts()+" watts");
        System.out.println("Laptop charger  : "+volt.getVolts()+" watts");
        System.out.println("Kettle charger  : "+volt1.getVolts()+" watts");

    }



    private static void testClassAdapter() {
        SocketClassAdapter socketClassAdapter = new SocketClassAdapter();

        Volt volt = getVolt(socketClassAdapter,65);
        Volt volt1 = getVolt(socketClassAdapter,120);
        Volt volt2 = getVolt(socketClassAdapter,18);
        System.out.println("Mobile charger  : "+volt2.getVolts()+" watts");
        System.out.println("Laptop charger  : "+volt.getVolts()+" watts");
        System.out.println("Kettle charger  : "+volt1.getVolts()+" watts");
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        return switch (i) {
            case 65 -> socketAdapter.get65Volt();
            case 18 -> socketAdapter.get18Volt();
            default -> socketAdapter.get120Volt();
        };
//        java.util.Arrays#asList()
//        java.io.InputStreamReader(InputStream) (returns a Reader)
//        java.io.OutputStreamWriter(OutputStream) (returns a Writer)

    }
}
