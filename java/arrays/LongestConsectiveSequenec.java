import java.util.*;

public class LongestConsectiveSequenec {

    private static int findLongestConsecutiveSequence(int arr[]){
        int n =arr.length;
        int longest = 1;

        for(int i=0;i<n;i++){
            int x = arr[i];
            int cnt = 1;

            while (linearSearch(arr, x+1) == true){
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int longestConsecutive(int arr[]){
        int n = arr.length;
        if(n == 0) return 0;

        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for(int i=0;i<n;i++){
            if(arr[i] - 1 == lastSmaller){
                cnt += 1;
                lastSmaller = arr[i];
            }else if(arr[i] != lastSmaller){
                cnt = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return  longest;
    }

    public static int longestSuccessiveElement(int arr[]){
        int n = arr.length;
        if(n == 0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        for(int it: set){
            if(!set.contains(it -1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x + 1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return  longest;
    }

    private static boolean linearSearch(int arr[], int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {3, 8, 5, 7, 6};

        System.out.println(findLongestConsecutiveSequence(arr));
        System.out.println(longestConsecutive(arr));
    }
}