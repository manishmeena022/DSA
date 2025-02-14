import java.util.Scanner;

public class Factorial {

    private static int printFactorial(int n){
        if(n == 0){
            return 1;
        }

        return n * printFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("factorial of N :" + printFactorial(n));;
    }
}