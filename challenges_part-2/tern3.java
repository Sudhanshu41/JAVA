import java.util.Scanner;

public class tern3 {
    public static void main(String[] args) {
        System.out.println("welcome to absolute number finder!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        tern3 abs = new tern3();
        int res = abs.abs(num);
        System.out.println("The absolute number is " + res);
    }
    public int abs(int num){
        return num<0?num*-1:num;
    }
}
