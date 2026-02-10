import java.nio.file.LinkPermission;
import java.util.Scanner;

public class gueesing {
    int random = (int) (Math.random()*10)+1;




    public void game(){
        int gnumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");

        do {
            gnumber= sc.nextInt();
            if (gnumber==random){
            System.out.println("You guessed right");
        } else if (gnumber<random  ) {
            System.out.println("guess higher!!");
        } else if (gnumber>random) {
            System.out.println("Guess lower");
        }
    }while (gnumber!=random);
    }

    public static void main(String[] args) {
        gueesing g = new gueesing();
        g.game();
    }
}
