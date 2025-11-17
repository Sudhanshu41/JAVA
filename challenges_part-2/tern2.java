import java.util.Scanner;

public class tern2 {
    public static void main(String[] args) {
        System.out.println("Welcome to even odd finder!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        tern2 eveodd = new tern2();
        String res = eveodd.evenOdd(num);
        System.out.println("Your number is " + res);
    }
    public String evenOdd(int num) {
        return num % 2 == 0 ? "Even" : "odd" ;
    }
}
