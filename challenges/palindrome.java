import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        long num =  sc.nextLong();
        boolean isPalin = Palindrome(num);
        if(isPalin){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
    public static boolean Palindrome(long n)
    {
        long rev = 0;
        long num = n ;
        while(n>0){
            long digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        System.out.println("revers is:" +rev);
        return rev == num;
    }

}
