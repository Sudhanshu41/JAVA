import java.util.Scanner;

public class tern4 {
    public static void main(String[] args) {
        System.out.println("Welcome to grade giver!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        int score =  sc.nextInt();
        tern4 obj = new tern4();
        String res = obj.grade(score);
        System.out.println("Your grade is " + res);
    }
    public String grade(int score){
        return score>80?"High": (score>50)?"Moderate":"Low";
    }
}
