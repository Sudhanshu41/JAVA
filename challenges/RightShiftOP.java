import java.util.Scanner;

public class RightShiftOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter your number: ");
        int num = input.nextInt();
        int result = num >> 2; //num >> k  ≈  num / (2^k)
        System.out.println("result: " + result);
    }
}
