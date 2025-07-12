package thread.synchronize;

public class Counter {

    private int count;


    public void incrementUnSynchronous(){
        count++;
    }

    public void incrementSynchronous(){

        //as a block or add key word of synchronous to the method.

        synchronized (Counter.class){
            count ++;
        }
    }


    public int getCount() {
        return count;
    }
}
