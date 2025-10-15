import java.util.Scanner;

public class RelationOP {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("You are eligible for driving!!");
        }
        else {
            System.out.println("You are not eligible for driving!!");
        }
        // >=  <=  == !=
    }
}
