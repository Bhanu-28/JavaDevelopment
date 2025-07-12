package thread.common;

public class ThreadId {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        System.out.println("Id of Thread1 is : "+thread1.threadId()+" Name of Thread1 is :"+thread1.getName());
        System.out.println("Id of Thread2 is : "+thread2.threadId()+" Name of Thread2 is :"+thread2.getName());
        System.out.println("Id of Thread3 is : "+thread3.threadId()+" Name of Thread3 is :"+thread3.getName());

        Thread mainThread = Thread.currentThread();
        System.out.println("current Thread Id: " +mainThread.threadId()+" Name : "+mainThread.getName());;

    }
}
