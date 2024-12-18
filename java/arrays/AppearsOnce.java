import java.util.*;

public class AppearsOnce {

    //Brute Force
    public static int findAppearOnce(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int num = arr[i];
            int count = 0;

            for(int j=0;j<n;j++){
                if(arr[j] == num){
                    count++;
                }
            }

            if(count == 1) return num;
        }
        return -1;
    }

    //Using hashing
    public static int appearOnce(int arr[]){
        int n = arr.length;

        int maxi = arr[0];
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int hash[] = new int[maxi + 1];

        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(hash[arr[i]] == 1){
                return arr[i];
            }
        }

        return -1;
    }

    //Using HashMap
    public static int appearonce(int arr[]){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }

        return -1;
    }

    //Using XOR
    public static int getSingleElement(int arr[]){
        int n = arr.length;

        int xorr = 0;
        for(int i=0;i<n;i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]){
        int arr[] = {2, 2, 1};

        int ans = findAppearOnce(arr);

        System.out.print("and :" + ans);
    }
}