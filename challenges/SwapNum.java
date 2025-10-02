import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station.\n\n");
        System.out.print("Enter your first number:");
        int a = input.nextInt();
        System.out.print("Enter your second number:");
        int b = input.nextInt();
        System.out.println("a: " +a+ " and b: " +b+ " before swapping.");
        int c = a;
        a =b ;
        b = c;
        System.out.println("a: " +a+ " and b: " +b+ " after swapping.");
    }
}
