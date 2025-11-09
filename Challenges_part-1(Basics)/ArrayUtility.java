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
    public static void DisplayArray(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static int [][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();
        int [][] nums = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Please enter " + (i+1) + " and "+(j+1)+":");
                nums[i][j] = input.nextInt();
            }
        }
        return nums;
    }
}
