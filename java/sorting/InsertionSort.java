public class InsertionSort{

    private static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        printArr(arr);
    }

    private static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 4};

        insertionsort(arr);
    }
}