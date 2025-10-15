import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a = sc.nextInt();
        System.out.print("Enter your second number:");
        int b = sc.nextInt();
        int leastMulti = LeastCommonMultiplier(a,b);
        System.out.println("Least Multiplier is: "+leastMulti);
    }
    public static int LeastCommonMultiplier(int num1,int num2){
       for (int i=1;i<=num2;i++){
           int factor = num1*i;
           if (factor%num2==0){
               return factor;
           }
       }
        return 0;
    }
}
