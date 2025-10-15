import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (Prime(n)){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
    public static boolean Prime(int num){
        if (num<=1) return false;
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }

        }
        return true;
    }
}
