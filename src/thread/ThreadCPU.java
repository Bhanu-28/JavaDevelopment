package thread;

public class ThreadCPU {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hi I am Bhanu"));
        thread1.start();

        Runnable runnable = () -> System.out.println("Hi I am Runnable");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();

        Thread threadRunnable = new Thread(new ThreadRunnable());
        threadRunnable.start();

        Thread threadMethodReference = new Thread(ThreadMethodReference::sayHello);
        threadMethodReference.start();

        System.out.println("Hi I am from main");
    }
}
