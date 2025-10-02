import java.sql.SQLOutput;
import java.util.Scanner;

public class chal4 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int first = one.nextInt();
        System.out.println("Enter your second number:");
        int second = two.nextInt();
        int sum = first+second;
        System.out.println("Addition of two numbers is: "+sum);
    }
}
