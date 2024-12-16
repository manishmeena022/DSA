import java.util.*;

public class LargestNumber {
    public static void printLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Largest Numebr -> " + max);
        System.out.println("Smallest Number ->" + min);
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,7,1233,8,9,12,11,43,1213,1235,5432};

        printLargest(nums);
    }
}
