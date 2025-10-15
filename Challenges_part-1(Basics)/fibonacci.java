import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        Fibonacci(n);

    }
    public static void Fibonacci(int n){
        if(n<0) return;
        System.out.println("0");
        if(n==0) return;
        System.out.println("1");
        int first =0,second =1;
        while(first+second<=n){
            int third = first+second;
            System.out.println(third+" ");
            first = second;
            second = third;
        }

    }
}
