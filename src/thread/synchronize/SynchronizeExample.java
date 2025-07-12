package thread.synchronize;

public class SynchronizeExample {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable SynchronousRunnable = () -> {
          for(int i = 0 ; i < 1500 ; i++){
              counter.incrementSynchronous();
          }
        };

        Thread thread = new Thread(SynchronousRunnable);
        Thread thread1 = new Thread(SynchronousRunnable);

        thread.start();
        thread1.start();

        try{
            thread.join();
            thread1.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("counter count :"+counter.getCount());
    }
}
