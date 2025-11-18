import java.util.Scanner;

public class arrayForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to finding maximum number!");
         int [] array = ArrayUtility.inputArray();
         int max = Integer.MIN_VALUE;
         for (int num : array) {
             if (num > max) {
                 max = num;
             }
         }
        System.out.println("The maximum number is:"+max);

    }



}
