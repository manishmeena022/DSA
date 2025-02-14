import java.util.Scanner;

public class PalindroneNumber {

    private static boolean isPalindrone(int n){
        int revNum = 0;
        int dup = n;

        while(n > 0){
            int ld = n%10;
            revNum = (revNum * 10) + ld;
            n = n/10;
        }

        if(dup == revNum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if(isPalindrone(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
