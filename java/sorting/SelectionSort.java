public class SelectionSort {
    
    private static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]< arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
