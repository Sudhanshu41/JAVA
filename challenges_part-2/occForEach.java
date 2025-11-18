import java.util.Scanner;

public class occForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to occurence of an element");
        int arr [] = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the occurences for: ");
        int num =  sc.nextInt();
        int occ=0;
        for (int array:arr){
            if (array==num){
                occ++;
            }
        }
        System.out.println("The occurence of your elements is: "+occ);
    }
}
