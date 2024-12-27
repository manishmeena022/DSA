import java.util.ArrayList;

public class RearrangeArray {

    public static int[] rearrange(int arr[], int n){

        ArrayList<Integer> pt = new ArrayList<>();
        ArrayList<Integer> nt = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                pt.add(arr[i]);
            }else{
                nt.add(arr[i]);
            }
        }

        System.out.println("pos" + pt);
        System.out.println("neg" + nt);

        for(int i=0;i<n/2;i++){
            arr[2*i] = pt.get(i);
            arr[2*i+1] = nt.get(i);
        }
        return arr;
    }

    public static int[] rearrangeArr(int nums[]){
        int n = nums.length;
        int pos = 0, neg = 1;

        int result[] = new int[n];

        for(int num : nums){
            if(num > 0) {
                result[pos] = num;
                pos += 2;
            }else {
                result[neg] = num;
                neg += 2;
            }
        }

        return result;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 2, -3, -1, -2, 3};
        int N = 6;

        int ans[] = rearrange(arr,N);

        printArr(ans);

    }
}