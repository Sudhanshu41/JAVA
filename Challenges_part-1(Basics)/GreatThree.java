import java.util.Scanner;

public class GreatThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = input.nextDouble();
        System.out.print("Enter your second number: ");
        double b = input.nextDouble();
        System.out.print("Enter your third number: ");
        double c = input.nextDouble();

        if (a>=b && a>=c){
            System.out.println(a+" is the greatest number");
        } else if ( b>=c) {
            System.out.println(b+" is the greatest number");
        }
        else {
            System.out.println(c+" is the greatest number");
        }
    }
}
