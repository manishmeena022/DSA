import java.util.Arrays;

public class LargestElement{

    public static int findLargestElement(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //Using inBuilt method
    public static int findLargestElem(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length -1];
    }

    public static void main(String args[]){
        int arr[] = { 8, 10, 5, 7, 9};

        int maxValue = findLargestElem(arr); //findLargestElement(arr);

        System.out.println("Max Value :" +  maxValue);

    }
}