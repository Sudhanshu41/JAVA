import java.util.Scanner;

public class BitOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise OR calculator.");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int result = first|second;
        System.out.println("result: "+result);
    }
}
