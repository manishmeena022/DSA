import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

    private static void countFreq(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }

        // Print the frequency of each element
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printArr(arr);

        countFreq(arr,n);
    }
}