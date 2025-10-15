import java.util.Scanner; // best debugging for beginners without using debugger is sout.

public class armStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        boolean isArmStrong = isArmStrong(n);
        if (isArmStrong) {
            System.out.println("Your number is Armstrong ");
        }
        else {
            System.out.println("not a armstrong number");
        }
    }
    public static boolean isArmStrong(int n){
        int noofDigits = noOfDigits(n);
        int numcopy = n;
        int finalNumber = 0;
        while(n>0){
            int lastdigit = n%10;
            n/=10;
            finalNumber+=pow(lastdigit,noofDigits);

        }
        return finalNumber==numcopy;
    }
    public static int noOfDigits(int num){
        int digits=0;

        while(num>0){
            digits++;
            num/=10;
        }
        return digits;


    }
    public static  int pow(int num1,int num2){
        int result = num1;
        int i =1;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;
    }

    }

