import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        long fact = Factorial(a);
        System.out.println("Factorial of the number is: "+fact);

    }
    public static long Factorial(int n){
        if(n<2){
            return 1;
        }
        long fact = 1;
        for(int i=2;i<=n;i++){

            fact=fact*i;
        }
        return fact;
    }
}
