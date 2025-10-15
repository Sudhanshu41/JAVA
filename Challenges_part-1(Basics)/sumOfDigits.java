import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("The sum is: "+sum);

    }
    public static int sum(int a){
        int Sum = 0;
        while (a>0){
            Sum = Sum + (a%10);
            a = a/10;
        }
        return Sum;
    }
}
