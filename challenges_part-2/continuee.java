import java.util.Scanner;

public class continuee {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of positive numbers!");
        Scanner sc=new Scanner(System.in);
        int num;
        int sum = 0;
        do {
           System.out.println("Please enter the number: ");
            num =sc.nextInt();
            if(num<0){
                continue;
            }
            sum+=num;


        }while(num>0);
        System.out.println("The sum of positive numbers is: "+sum);





    }
}
