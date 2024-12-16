import java.util.*;

public class LinearSearch{
    public static int linearSearch(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12 , 14};
        int key = 11;

        int idx = linearSearch(nums, key);

        if(idx == -1){
            System.out.println(key + "Key is not found");
        }else {
            System.out.println(key + " is found at index " + (idx + 1));
        }
    }
}