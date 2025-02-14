import java.util.Scanner;

public class CheckPrime {

    private static boolean isPrime(int n){
        int cnt = 0;

        for(int i=1;i<= Math.sqrt(n);i++){
            if(n%i==0){
                cnt += 1;

                if(n/i != i){
                    cnt += 1;
                }
            }
        }

        if(cnt ==2){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
