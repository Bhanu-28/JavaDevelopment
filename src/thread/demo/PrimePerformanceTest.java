package thread.demo;

public class PrimePerformanceTest {

    public static void main(String[] args) throws InterruptedException {
        int startRange = 1;
        int endRange = 10_00_000;

        // Single Threaded
        long singleStart = System.currentTimeMillis();
        int singleCount = 0;
        for (int i = startRange; i <= endRange; i++) {
            if (PrimeUtil.isPrime(i)) {
                singleCount++;
            }
        }
        long singleEnd = System.currentTimeMillis();
        System.out.println("Single Thread - Total primes: " + singleCount + ", Time: " + (singleEnd - singleStart) + " ms");

        // Multi-threaded
        long multiStart = System.currentTimeMillis();
        PrimeCounterThread t1 = new PrimeCounterThread(startRange, endRange / 2);
        PrimeCounterThread t2 = new PrimeCounterThread((endRange / 2) + 1, endRange);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int multiCount = t1.getCount() + t2.getCount();
        long multiEnd = System.currentTimeMillis();
        System.out.println("Multi Thread - Total primes: " + multiCount + ", Time: " + (multiEnd - multiStart) + " ms");
    }
}

