import java.util.Scanner;

public class ArrayUtility {
    public static int [] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int size = input.nextInt();
        int [] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter " + i + ": ");
            nums[i] = input.nextInt();
        }
        return nums;
    }
}
