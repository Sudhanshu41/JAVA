import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        if(age>=60){
            System.out.println("Senior citizen");
        } else if (age>=20) {
            System.out.println("Adult");
        } else if (age>=13) {
            System.out.println("Teen");
        } else {
            System.out.println("Child");
        }
    }
}
