import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
       // String name = input.next();/*next sirf one word at a time it stops reading when it encounters a space,tab or new line*/
        String name = input.nextLine();/*Reads the whole line and breake when encountered by a new line*/
        System.out.println("Good Morning "+name);
        System.out.println(name+", Also tell me your age.");
        int age = input.nextInt();
        System.out.println("your age is "+age);
    }
}
