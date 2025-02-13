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
