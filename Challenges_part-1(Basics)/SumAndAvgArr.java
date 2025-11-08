import java.util.Scanner;

public class SumAndAvgArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array sum and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }
    public static long sum(int arr[]){
       long sum = 0;


       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
        return sum;
    }
    public static double avg(int arr[]){
        double sum = sum(arr);
        return  sum / arr.length;
    }
}
