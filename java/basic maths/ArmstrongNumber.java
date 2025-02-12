import java.util.Scanner;

public class ArmstrongNumber {
    
    private static boolean isArmstrong(int n){
        int num = n;
        int pow = String.valueOf(n).length();

        int sum = 0;
        while(num > 0){
            int ld = num%10;
            //sum += ld*ld*ld;
            sum += Math.pow(ld, pow);
            num = num/10;
        }

        System.out.println("SUM :" + sum + "NUM :" + num + "POW :" + pow);
        if(sum == n){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
