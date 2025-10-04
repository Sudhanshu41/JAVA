import java.util.Scanner;


public class OddEveBit {
    /**
     * This is my main method
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        if ((num&1) == 1){
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is even");
        }
    }
}
