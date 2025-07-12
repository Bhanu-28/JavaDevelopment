package thread.common.priority;

public class PriorityDemo {

    public static void main(String[] args) {

        Thread thread = new Thread(new PriorityExample("Thread A"));
        Thread thread1 = new Thread(new PriorityExample("Thread B"));
        Thread thread2 = new Thread(new PriorityExample("Thread C"));

        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread.start();
        thread1.start();
        thread2.start();

        try{
            thread.join();
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
