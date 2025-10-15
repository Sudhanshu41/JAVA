import java.util.Scanner;

public class LogicalOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you a Female (true/false)");
        boolean gender = input.nextBoolean();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age<5){
            System.out.println("You got 75% discount!");
        } else if ( gender) {
            System.out.println("You got 50% discount");
        } else if (age>60 && !gender ) {
            System.out.println("You got 25% discount");
        }
        else {
            System.out.println("You are not eligible");
        }


    }
}
