package thread.common.wait;

public class SharedResource {

    private int data;

    private boolean isEmpty = true;
/*
    purpose of this synchronized.
synchronized is a keyword inside Java which you can use in the scenarios of multi-threading environment.
But in real projects, you may have hundreds of Producer threads and hundreds of Consumer threads,

and at a time you want only one Producer thread and one Consumer thread to execute the business logic
 */
    synchronized void produce(int value)  {

        while(!isEmpty){
            //Buffer is not empty wait for the consumer to consume.
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        data = value;
        isEmpty = false;

        System.out.println("produced data : "+data);
        notify();
        // Notify the consumer to consume.

    }


    synchronized int consume(){

        while(isEmpty){
            try{
                // wait for the producer to producer.
                wait();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

        int consumedData = data;
        isEmpty = true;

        notify();
/*        since this thread it is also invoking the notify() method, the other Producer thread which is waiting,

        it is going to wake up and it is going to look for the CPU time so that it can start generating the

        new value.*/
        return consumedData;
    }
}
