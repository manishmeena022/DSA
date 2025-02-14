import java.util.HashMap;
import java.util.Map;

public class MaxMinFrequency {

    private static void findMaxMinFreq(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxEle = 0, minEle = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq){
                maxEle = element;
                maxFreq = count;
            }

            if(count < minFreq){
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println(null == map.get(maxEle) ? "No element found" : "Element with maximum frequency: " + maxEle + " Frequency: " + maxFreq);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,1,2,3,1,2,1};

        findMaxMinFreq(arr);
    }    
}
