import java.util.Scanner;

public class ReverseNumber {

    private static void reverseNum(int n ){
        String str = Integer.toString(n);

        for(int i=str.length();i>0;i--){
            System.out.print(str.charAt(i-1));
        }
    }


    //////////////////////////////////////////
    private static void reveNum(int n){
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }

        System.out.println(rev);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverseNum(n);

        System.out.println();
        reveNum(n);
    }
}
