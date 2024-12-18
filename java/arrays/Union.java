
import java.util.*;

public class Union{

    //Using HashMap
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();


        for(int i=0;i<arr1.length;i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }

        for(int i=0;i<arr2.length;i++){
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }

        for(int i : freq.keySet()){
            Union.add(i);
        }

        return Union;
    }

    // Using HashSet
    public static ArrayList<Integer> findUni(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        for(int i : set){
            Union.add(i);
        }

        return Union;
    }

    // Using two pointer
    public static ArrayList<Integer> findU(int arr1[], int arr2[]){

        ArrayList<Integer> Union = new ArrayList<>();
        int i=0,j=0;
        int n = arr1.length, m = arr2.length;
        
        while(i < n && j < m){
            while(i > 0 && i< n && arr1[i] == arr1[i -1]){
                i++;
            }

            while(j > 0 && j < m && arr2[j] == arr2[j -1]){
                j++;
            }

            if(i < n && j < m){
                if(arr1[i] < arr2[j]){
                    Union.add(arr1[i]);
                    i++;
                }else if(arr1[i] > arr2[j]){
                    Union.add(arr2[j]);
                    j++;
                }else {
                    Union.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        while( i < n){
            if( i == 0 || arr1[i] != arr1[i -1]){
                Union.add(arr1[i]);
            }
            i++;
        }

        while( j < m) {
            if(j == 0 || arr2[j] != arr2[j -1]){
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }

    // print array
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};

        ArrayList<Integer> arr = findU(arr1, arr2);

        for(int val : arr) 
            System.out.print(val + " ");
    }
}