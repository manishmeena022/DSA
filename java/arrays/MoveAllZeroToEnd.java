package DSA.java.arrays;

import java.util.ArrayList;

public class MoveAllZeroToEnd {
    public static int[] moveAllZeroToEnd(int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        for(int i=0;i<nz;i++){
            arr[i] = temp.get(i);
        }

        for(int i=nz;i<arr.length;i++){
            arr[i] = 0;
        }

        return arr;
    }
    
    public static int[] movesZeros(int arr[]){
        int j = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1 ) return arr;

        for(int i=j +1;i<arr.length;i++){
            if((arr[i] != 0)){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1};

        int ans[] = moveAllZeroToEnd(arr);
        
        print(ans);
    }
    
}
