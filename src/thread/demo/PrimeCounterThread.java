package thread.demo;

public class PrimeCounterThread extends Thread {
    private int start, end;
    private int count;

    public PrimeCounterThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (PrimeUtil.isPrime(i)) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }
}

