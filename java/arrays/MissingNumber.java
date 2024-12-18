public class MissingNumber{

    // Brute force
    public static int findMissingNumber(int arr[], int n){
        for(int i=1; i<=n;i++){
            int flag = 0;
        
            for(int j=0;j<n-1;j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }

    //Using Hashing
    public static int missingNumber(int arr[], int n){
        int hash[] = new int[n + 1];

        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    //Using Summation Approach
    public static int missingNum(int arr[], int n){
        int sum = (n*(n+1))/2;

        int s2 = 0;
        for(int i=0;i<n-1;i++){
            s2 += arr[i];
        }

        int missingNumber = sum - s2;
        return missingNumber;
    }

    //XOR Approach
    public static int missingNumb(int arr[],int n){
        int xor1 = 0, xor2 =0;

        for(int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i + 1);
        }

        xor1 = xor1^n;

        return (xor1^ xor2);
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,5};
        int n = 5;

        System.out.println(missingNumb(arr, n));
    }
}