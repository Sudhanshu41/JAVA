import java.util.Scanner;

public class hcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a = sc.nextInt();
        System.out.print("Enter your second number:");
        int b = sc.nextInt();
        int highestCom = HCD(a,b);
        System.out.println("The highest common divisor is "+highestCom);
    }
    public static int HCD(int a,int b){
        int least = least(a,b);
        for(int i=2;i<=least;i++){
            if (a%i==0 && b%i==0){
                return i;
            }

        }
        return 1;
    }
    public static int least(int a,int b){
        if(a>b){
            return b;
        }
        else {
            return a;
        }
    }
}
