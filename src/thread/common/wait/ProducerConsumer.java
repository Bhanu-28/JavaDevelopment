package thread.common.wait;

/*
    producer Thread 1 -> wait till the thread consumes.
    Consumer Thread 1 -> Notify the producer once the consumption is completed.
*/
public class ProducerConsumer {

    public static void main(String[] args) {

        //Procducer Thread

        SharedResource sharedResource = new SharedResource();

        Runnable runnable = () -> {
            for(int i =0 ; i<10; i++){
                sharedResource.produce(i);

                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread producerThread = new Thread(() -> {
            for(int i =0 ; i<10; i++){
                sharedResource.produce(i);

                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });


        Runnable consumerRunnable = () -> {
            for(int i =0 ; i<10; i++){

                System.out.println("consumed Data :"+sharedResource.consume());

            }
        };
        Thread consumerThread = new Thread(() -> {
            for(int i =0 ; i<10; i++){

                System.out.println("consumed Data :"+sharedResource.consume());

            }
        });

        producerThread.start();
        consumerThread.start();


    }
}
