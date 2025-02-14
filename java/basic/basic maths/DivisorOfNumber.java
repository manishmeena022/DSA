import java.util.ArrayList;
import java.util.Scanner;

public class DivisorOfNumber {

    private static int[] findDivisor(int n, int size[]){
        int[] divisors = new int[n];
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisors[count++] = i;
            }
        }

        size[0] = count;

        return divisors;
    }

    private static ArrayList<Integer> findDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrt = (int)Math.sqrt(n);

        for(int i=1;i<= sqrt;++i){
            if(n%i==0){
                divisors.add(i);
                if(i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }

    private static void printArray(int arr[], int size[]){
        for(int i=0;i<size[0];i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int size[] = new int[1];
        // int divisors[] = findDivisor(n, size);

        // System.out.print("Divisors of " + n + " are: ");
        // printArray(divisors, size);
        // System.out.println();

        // divisors = null;

        ArrayList<Integer> divisor = findDivisors(n);

        for(int div : divisor){
            System.out.print(div + " ");
        }
        System.out.println();
    }
}
