package thread.volatil;

public class SharedResource {

    private volatile boolean stopFlag = false;

    public void setStopFlag(){
        stopFlag = true;
    }

    public void doWork(){

        while(!stopFlag){
            System.out.println("working....");
        }

        System.out.println("worker stopped...");
    }
}
