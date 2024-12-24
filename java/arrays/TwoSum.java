import java.util.*;

public class TwoSum{
    public  static  boolean isTwoSumExists(int arr[], int s){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == s){
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] twoSum(int arr[], int s){
        int n = arr.length;
        int arr1[] = new int[2];
        arr1[0] = arr1[1] = -1;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == s){
                    arr1[0] = i;
                    arr1[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static String twosum(int arr[], int target){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int remSum = target - num;
            if(mp.containsKey(remSum)){
                return "YES";
            }
            mp.put(arr[i], i);
        }
        return  "NO";
    }

    public static int[] twosum(int arr[], int s){
        int n = arr.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = arr[i];
            int remSum = s - num;
            if(mp.containsKey(remSum)){
                ans[0]  = mp.get(remSum);
                ans[1] = i;
                return ans;
            }
            mp.put(arr[i], i);
        }
        return ans;


        public static String twoSum(int arr[], int target){
            int n = arr.length;
            Arrays.sort(arr);
            int left = 0 , right = n -1;
            while(left < right){
                int sum = arr[left] + arr[right];

                if(target == sum){
                    return "YES";
                }else if(sum < target) left ++;
                else right--;
            }
            return "NO";
        }



    public static void main(String args[]){
        int N = 8;
        int arr[] = {2,6,5,8,11};
        System.out.println(isTwoSumExists(arr,N));
        System.out.println(twosum(arr,N));
    }
}