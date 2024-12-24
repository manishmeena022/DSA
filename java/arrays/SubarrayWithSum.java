import java.util.*;

public class SubarrayWithSum {

    //Brute force approach
    public static int findSubarray(int arr[], int N){
        int n =arr.length;
        int len = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long s = 0;
                for(int k = i;k<= j;k++){
                    s += arr[k];
                }

                if(s == N){
                    len = Math.max(len, j - i + i);
                }
            }
        }
        return len;
    }

    //Using Two loops
    public static int findSubArraySum(int arr[], int N){
        int n = arr.length;

        int len = 0;
        for(int i =0;i<n;i++){
            long s = 0;
            for(int j =i;j<n;j++){
                s +=arr[j];

                if(s == N){
                    len = Math.max(len , j - i + 1);
                }
            }
        }
        return len;
    }

    //Using HashMap
    public static int findSubarraySum(int arr[], int N){
        int n = arr.length;

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum == N){
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum -N;

            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }


            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    // Using two pointers
    public static int findSubarraysum(int arr[], int N){
        int n = arr.length;

        int left = 0,right= 0;
        long sum = arr[0];
        int maxLen = 0;

        while(right < n){
            while(left <= right && sum > N){
                sum -= arr[left];
                left++;
            }

            if(sum == N){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right < n) sum += arr[right];
        }
        return maxLen;
    }

    public static void main(String args[]){
        int arr[] = {2,3,5,1,9};

        int len1 = findSubarray(arr, 5);
        int len2 = findSubArraySum(arr, 5);
        int len3 = findSubarraySum(arr, 5);
        int len4 = findSubarraysum(arr, 5);
        System.out.print("Len : "+ len1 + " "  + len2 + " " + len3 + " " +  len4 );
    }
}