import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rev = reverse(n);
        System.out.println("The reversed number is "+rev);
    }
    public static int reverse(int num){
        int temp = 0;
       int i=0;
        while (num>0){
            int digit = num%10;
            temp = temp*10 +digit;
            num = num/10;
        }
        return temp;
    }
}
