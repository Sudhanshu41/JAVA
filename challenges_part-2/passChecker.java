import java.util.Scanner;

public class passChecker {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the pass checker");
//        System.out.println("Enter the pass: ");
//        long num = sc.nextLong();
//        long num1;
//        do {
//            System.out.println("Enter the correct password");
//             num1 =  sc.nextLong();
//        }while(num1!=num);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to set your password.\n");
        String Password;
        do {
            System.out.print("Enter your password: ");
            Password = sc.next();

        }while (!isvalid(Password));
        System.out.println("Thanks for entering valid password.");
    }
    public static boolean isvalid(String Password) {
        return Password.length() >6;
    }
}
