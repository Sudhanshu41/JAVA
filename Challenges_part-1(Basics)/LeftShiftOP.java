import java.util.Scanner;

public class LeftShiftOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter your number: ");
        int num = input.nextInt();
        int result =num << 6; // jo number enter karoge ussi number mai 6 bari 2 multiply kr dena
        // num << 31 → pushes the 1 into the sign bit, result may become negative
        // num << 32 → same as num << 0 (because shift % 32), so result = num
        // num << 33 → same as num << 1 (because 33 % 32 = 1), so result = num * 2

        System.out.println("result: "+result);
    }
}

