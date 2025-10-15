import java.util.Scanner;

public class PeriOfRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double a = input.nextDouble();
        System.out.print("Enter the breadth of rectangle:");
        double b = input.nextDouble();
        double area = 2*(a+b);
        System.out.println("Perimeter of rectangle is: "+area);
    }
}
