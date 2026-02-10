import java.util.Scanner;

public class continuee2 {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number checker!");
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
