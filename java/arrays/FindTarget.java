public class FindTarget {

    private static int findTarget(int arr[], int n){
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == n){
                return mid;
            }

            if(n > arr[mid]) {
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return  -1;
    }

    public static void main(String args[]){
        int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = 7;

        System.out.println(findTarget(arr,n));
    }
}