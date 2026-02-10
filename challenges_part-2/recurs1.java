import java.util.Scanner;

public class recurs1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to printing Fibonacci Series");
        System.out.print("Enter the number of elements to be printed: ");
        int count=sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.print(fibonaccii(i)+" ");
        }
    }
    public static  int fibonaccii(int pos){
        if(pos==1){
            return 0;
        }
        if(pos==2){
            return 1;
        }
        return fibonaccii(pos-1)+fibonaccii(pos-2);
    }
}
