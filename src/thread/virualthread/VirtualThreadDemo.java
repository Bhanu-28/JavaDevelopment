package thread.virualthread;

import java.util.Random;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Random random = new Random();

       Runnable runnable = () -> {
           double result = random.nextDouble(1000)* random.nextDouble(1000);
           System.out.println("Random number result:"+result);

       };

       for(int i=0; i<50000; i++){

           /*
           Normal Thread execution
           Total time taken : 17689

           Thread thread = new Thread(runnable);
           thread.start();
           thread.join();

            */

/*
Virtual Thread
Total time taken : 1220
 */

           Thread.startVirtualThread(runnable).join();

//           Thread.ofVirtual().name("ofVirtualThread").start(runnable).join();





       }

       long endTime = System.currentTimeMillis();

        System.out.println("Total time taken : "+(endTime-startTime));

    }
}
