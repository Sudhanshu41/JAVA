import java.util.Scanner;

public class switcth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector");
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        switch(number){
            case 1:
                System.out.println("The day is monday");
                break;
            case 2:
                    System.out.println("The day is tuesday");
                    break;
            case 3:
                System.out.println("The day is wednesday");
                break;
            case 4:
                System.out.println("The day is thursday");
                break;
            case 5:
                System.out.println("The day is friday");
                break;
            case 6:
                System.out.println("The day is saturday");
                break;
            case 7:
                System.out.println("The day is sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
