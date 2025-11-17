import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.println("Welcome to month calculator!");
        System.out.print("Enter the number from 1 to 12: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        month(num);

    }
    public static void month(int num){
        String str = switch (num){
        case 1-> "January";
        case 2-> "February";
        case 3-> "March";
        case 4-> "April";
        case 5-> "May";
        case 6-> "June";
        case 7-> "July";
        case 8-> "August";
        case 9-> "September";
        case 10-> "October";
        case 11-> "November";
        case 12-> "December";
            default ->"Invalid number";
    };
        System.out.println(str);
    }
}
