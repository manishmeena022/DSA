public class CountOccurrences {

    public static int firstOcc(int arr[], int k){
        int n = arr.length;
        int low = 0 , high = n-1;
        int first = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == k) {
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < k){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOcc(int arr[], int k){
        int low = 0,high = arr.length -1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == k){
                last = mid;
                low = mid + 1;
            }else if(arr[mid] < k){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr,int k){
        int first = firstOcc(arr, k);
        if(first == -1) return new int[] { -1, -1};
        int last = lastOcc(arr, k);

        return new int[]{first, last};
    }

    public static int count(int arr[], int k){
        int[] ans = firstAndLastPosition(arr, k);
        if(ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,3,4};

        System.out.println(count(arr, 3));
    }
}
