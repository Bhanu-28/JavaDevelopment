package thread.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();


        if(reentrantLock.tryLock(2000, TimeUnit.MILLISECONDS)){
            System.out.println("lock aquired");
        }
        else{
            System.out.println("lock not acquired");
        }


    }
}
