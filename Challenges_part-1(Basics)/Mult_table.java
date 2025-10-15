import java.util.Scanner;

public class Mult_table {
    public static void main(String[] args) {
        table();
    }
    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which you want the multiplication number: ");
        int a =  input.nextInt();
        System.out.println("The multiplication table is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a*i);
        }

    }
}
