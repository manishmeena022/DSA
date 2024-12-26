import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // Using brute force
    public static int findMajorityElement(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count  = 0;
            for(int j=0;j<n;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }

    // Using HashMap
    public static int majorityElement(int arr[]){
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            int value = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it : hm.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2};

        System.out.println("FME" + findMajorityElement(arr));
        System.out.println("ME" + majorityElement(arr));
    }
}