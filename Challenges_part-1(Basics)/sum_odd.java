import java.util.Scanner;

public class sum_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want sum:");
        int b  = sc.nextInt();
        int oddSum = sum(b);
        System.out.println("The sum is: "+oddSum);

    }
    public static int sum(int a){
        int Sum = 0;
        for (int i = 1; i <= a; i=i+2) {
            Sum = Sum + i;
        }
        return Sum;
    }
//    public static void sum(){
//        Scanner input  = new Scanner(System.in);
//        System.out.print("Enter the range till where you want the sum of odd number:");
//        int b = input.nextInt();
//        int Sum = 0;
//        for (int i = 1; i <= b; i=i+2){
//           Sum = Sum+ i;
//
//        }
//        System.out.println(Sum);
//
//    }
}
