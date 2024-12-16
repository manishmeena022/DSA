package DSA.java.arrays;

public class SecondLargest {

    public static int secondLargest(int arr[]){
        int n = arr.length;

        if(n < 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};

        System.out.println(secondLargest(arr));
    }
    
}
