import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5,guess;
        System.out.println("Welcome to number guessing game!");
    do {
        System.out.println("Please guess the number between 1 to 10.");
        guess = sc.nextInt();
    }while(num!=guess);
        System.out.println("You have successfully guessed the number!");


    }
}
