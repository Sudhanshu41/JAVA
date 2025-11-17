import java.util.Scanner;

public class tern1 {
    public static void main(String[] args) {
        System.out.println("Welcome to finding minimum number!");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num = sc.nextInt();
        System.out.print("enter the second number: ");
        int num2 = sc.nextInt();
        tern1 tern =  new tern1();
        int min = tern.min(num, num2);
        System.out.println("The minimum number is " + min);

    }
    public int min(int num,int num2){
        return num<num2?num:num2;
    }
}
