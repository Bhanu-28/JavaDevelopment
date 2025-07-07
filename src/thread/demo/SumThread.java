package thread.demo;

public class SumThread extends Thread {

    private int startValue;
    private int endValue;
    private long result;

    public SumThread(int startValue, int endValue ) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    @Override
    public void run(){
        for(long i = startValue ; i<=endValue; i++){
            result = result + i;
        }
    }

    public long getResult(){
        return result;
    }


}
