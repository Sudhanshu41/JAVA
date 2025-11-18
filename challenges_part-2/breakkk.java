import java.util.Scanner;

public class breakkk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Please enter your command:");
            String command=sc.nextLine();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("you have successfully exited!");
    }
}
