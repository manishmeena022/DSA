import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leaders {

    private static ArrayList<Integer> findLeaders(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean leader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i] ){
                    leader = false;
                    break;
                }
            }
            System.out.println("flag " +  leader);
            if(leader){
                list.add(arr[i]);
            }
        }
        return list;
    }

    private static ArrayList<Integer> leaders(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(arr[i] >= max){
                list.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(list);
        return list;
    }
    public static void main(String args[]){
        int arr[] = { 16, 17, 4, 3, 5 ,2};

        ArrayList<Integer> ans = findLeaders(arr);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}