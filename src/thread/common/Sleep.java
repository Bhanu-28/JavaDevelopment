package thread.common;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i<5; i++){
            System.out.println("value of i is : "+i);
            Thread.sleep(1000);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken :"+(endTime-startTime)+" ms");

    }
}
