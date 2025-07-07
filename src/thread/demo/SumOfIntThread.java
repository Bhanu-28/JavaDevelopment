package thread.demo;


public class SumOfIntThread {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        long result = 0;
        SumThread sumThread1 = new SumThread(0,Integer.MAX_VALUE/2);
        SumThread sumThread2 = new SumThread((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);
        sumThread1.start();
        sumThread2.start();
        sumThread1.join();
        sumThread2.join();
        result = sumThread1.getResult()+sumThread2.getResult();
        System.out.println("result :"+result);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to calculate Sum of Int :"+(endTime-startTime)+"ms");
    }
}