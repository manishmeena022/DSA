public class BinarySearch {
    
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 4;
        int idx = binarySearch(nums, key);

        if(idx == -1){
            System.out.println("KEY not found");
        }else {
            System.out.println("Key found at index at  :" + idx);
        }
    }
}   
