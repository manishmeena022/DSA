public class ReveseArray {

    public static void reverse(int arr[]){
        int first = 0, last = arr.length -1;
        
        while(first < last){

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        reverse(nums);
        print(nums);
    }
}
