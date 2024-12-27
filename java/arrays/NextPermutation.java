import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static List<Integer> findNextPermutation(List <Integer> A){
        int n = A.size();

        int ind = -1;
        for(int i=n-2;i>= 0;i--){
            if(A.get(i) < A.get(i+1)){
                ind = i;
                break;
            }
        }

        if(ind == -1) {
            Collections.reverse(A);
            return A;
        }

        for(int i=n-1;i>ind;i--){
            if(A.get(i) > A.get(ind)){
                int temp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, temp);
                break;
            }
        }

        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    public void nextPermutation(int[] nums) {
        // Step 1: Find the largest index i such that nums[i] < nums[i + 1]
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such index exists, find the largest index j greater than i such that nums[i] < nums[j]
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap the values of nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 3: Reverse the sequence from nums[i + 1] to the end
        reverse(nums, i + 1);
    }

    // Helper function to swap elements at indices i and j
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse the subarray nums[i...n-1]
    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        List<Integer> A = Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
        List<Integer> ans = findNextPermutation(A);

        System.out.println("The next permutation is :  [");

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i) + " ");
        }
        System.out.println("]");
    }
}