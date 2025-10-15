import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade calculator!!");
        System.out.print("Please enter your percentage: ");
        double per = input.nextDouble();
        if (per>=90){
            System.out.println("Your Grade is A");
        } else if (per>=75) {
            System.out.println("Your Grade is B");
        } else if (per>=60) {
            System.out.println("Your Grade is C");
        } else if (per>=30) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is F");
        }
    }
}
