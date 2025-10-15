import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 2, 4, 1, 5, 8, 7, 9, 52,};

        System.out.println("Welcome to array searching: ");
        System.out.print("Please enter the number to be searched:");
        int number = input.nextInt();
        if (isFound(arr,number)) {
            System.out.println("Number is found in the array");
        }
        else {
            System.out.println("Number is not found in the array");
        }
    }
    public static boolean isFound(int arr[],int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
