import java.util.Scanner;

public class BitCOMPLEMENT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter your number: ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("result: "+result); // ~n = -(n+1)
    }
}
