public class LowerBound {
    private static int findLowerBound(int arr[], int X){
        int n = arr.length;
        int ans = -1;

        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] <= X){
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1 ;
            }
        }

        return ans;

    }
    public static void main(String args[]){
        int arr[] = {3,5,8,15,19};
        System.out.println(findLowerBound(arr, 9));
    }
}