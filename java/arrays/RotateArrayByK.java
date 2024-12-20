package DSA.java.arrays;

public class RotateArrayByK {

    public static void rotateArray(int arr[],int n, int k){
        if(n==0) return; // if array is empty

        k = k %n; // divide it by k to avoid multiple rotations

        if(k > n) return; // check if it different is still greater than length of array

        int [] temp = new int[k];  // to add last k elements in temp array

        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        for(int i=0;i< n- k; i++){
            arr[i] = arr[i + k];

        }
        for(int i = n -k ;i < n;i++){
            arr[i] = temp[i - n + k];
        }
    }

    public static void Reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void RotateToLeft(int arr[], int n, int k){
        int n = arr.length;
        
        k = k % n;

        if(k == 0) return;
        
        Reverse(arr, 0, n - k-1);
        Reverse(arr, n - k, n -1);
        Reverse(arr, 0, n-1);
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2,3,4,5,};
        int n = arr.length;

        RotateToLeft(arr,n, 4);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
