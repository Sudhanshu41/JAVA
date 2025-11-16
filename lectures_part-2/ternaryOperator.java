import java.sql.SQLOutput;
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();
       // int greaterNumber;
//        if (firstNumber>secondNumber){
//           greaterNumber=firstNumber;
//        }
//        else {
//            greaterNumber=secondNumber;
//        }
//        System.out.println(greaterNumber+ " is the greates number");
        int greaterNumber = firstNumber>secondNumber?firstNumber:secondNumber;
        System.out.println("Your greates number is: "+greaterNumber);
    }
}
