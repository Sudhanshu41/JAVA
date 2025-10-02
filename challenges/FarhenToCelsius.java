import java.util.Scanner;

public class FarhenToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in fahrenheit: ");
        double a = input.nextDouble();
        double celsius = (a-32)*5/9;
        System.out.println("temp in celsius is: "+celsius);
        // Math.pow(jiske upar power lgani hai,jitni power lagani hai)
    }
}
