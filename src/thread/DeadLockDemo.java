package thread;

public class DeadLockDemo {

    public static final String R1 = "Resource 1";
    public static final String R2 = "Resource 2";

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
           synchronized (R1){
               System.out.println("Thread T1 locked Resource R1");
               synchronized (R2){
                   System.out.println("Thread T1 locked Resource R2");
               }
           }
        });


        Thread thread2 = new Thread(() -> {
            synchronized (R1){
                System.out.println("Thread T2 locked Resource R1");
                synchronized (R2){
                    System.out.println("Thread T2 locked Resource R2");
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
