package thread.volatil;

public class VolatileDemo {


    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread thread = new Thread(() -> sharedResource.doWork());

        long currentTimeMilliSeconds = System.currentTimeMillis();

        thread.start();

        Thread thread1 = new Thread(() -> {
            try{
                Thread.sleep(10000);
                sharedResource.setStopFlag();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTimeMilliSeconds = System.currentTimeMillis();
        System.out.println("Total time take :"+ (endTimeMilliSeconds-currentTimeMilliSeconds));
        System.out.println("Two Threads Execution completed...");
    }
}
