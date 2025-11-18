import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial generator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }
    public static long factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
