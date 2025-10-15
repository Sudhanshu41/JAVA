import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        greet();
        int first = read();
        int second = read();
        System.out.println(first + second);
    }
    public static int read() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number:");
       int number = input.nextInt();
       return number; // after return no code is executed in that particular yk.
    }
    public static void greet(){
        System.out.println("Welcome to the calculator");
    }
}
