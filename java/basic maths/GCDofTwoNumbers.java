import java.util.Scanner;

public class GCDofTwoNumbers {
    
    private static int findGCD(int n1,int n2){
        int gcd = 1;

        for(int i=1;i<= Math.min(n1, n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    private static int findgcd(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else {
                n2 = n2 % n1;
            }
        }

        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

       System.out.println(findGCD(n1, n2));
       System.out.println(findgcd(n1, n2));
    }
    
}
