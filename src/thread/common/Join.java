package thread.common;

public class Join {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println(i);
            }
        }
        );

        thread.start();

        try{
            thread.join(); // This method will make sure that thread execution will get completed after
                           // that will go for main thread.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread ended"); // Main is not waiting for thread to get ended.
    }
}
