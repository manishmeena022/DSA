import java.util.Scanner;

public class ReverseArray {

    // Using an extra array.
    private static int[] reverseArray(int[] arr, int s){
        int temp[] = new int[s];
        for(int i=0;i<s;i++){
            temp[i] = arr[s-i-1];
        }
        return temp;
    }

    // Without using extra array.
    private void reverseArr(int arr[]) {
        // code here
        int n = arr.length;
        
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    // Using Recursion.
    private static void reverseArrayRecursion(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursion(arr, start+1, end-1);
    }

    private static void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
    
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }

        int newArr[] = reverseArray(arr, s);
        printArray(newArr, s);
    }
    
}
