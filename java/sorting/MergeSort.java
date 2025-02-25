import java.util.ArrayList;

public class MergeSort {

    private static void merge(int arr[], int low,  int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low, right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i= low;i<= high;i++){
            arr[i] = temp.get(i- low);
        }
    }

    private static void  mergeSort(int arr[], int l, int h){
        if(l>=h) return;
        int mid = (l+h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);

        merge(arr, l, mid, h);
    }

    private static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {5, 2, 3, 1, 4};
        
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
