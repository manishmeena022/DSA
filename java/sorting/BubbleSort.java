public class BubbleSort {

    private static void bubbleSort(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
