package thread.synchronize;

public class UnSynchronizeExample {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable unSynchronousRunnable = () -> {
          for(int i = 0 ; i < 1500 ; i++){
              counter.incrementUnSynchronous();
          }
        };

        Thread thread = new Thread(unSynchronousRunnable);
        Thread thread1 = new Thread(unSynchronousRunnable);

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
