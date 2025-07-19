package thread.deadlock;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(arr));;
    }

    public static int findEquilibriumIndex(int[] arr){

//        we can use this if we want to return multiple equilibrium indices.
//        List<Integer> equilibriumIndices = new ArrayList<>();

        int totalSum = 0;

        for(int num: arr){
            totalSum = totalSum + num;
        }

        int leftSum = 0;

        for(int i=0; i<arr.length;i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
