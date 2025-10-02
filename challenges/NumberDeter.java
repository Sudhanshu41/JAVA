import javax.swing.*;
import java.util.Scanner;

public class NumberDeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        double num = input.nextDouble();
        if (num>0){
            System.out.println("Its a Positive Number!!");
        } else if (num<0) {
            System.out.println("Its a Negative Number!!");
        }
        else {
            System.out.println("The number is ZERO!!!");
        }
    }
}
