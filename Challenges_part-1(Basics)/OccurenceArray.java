import java.util.Scanner;

public class OccurenceArray {
    public static void main(String[] args) {
        System.out.println("Welcome to number of occurences in an array");
        int [] numArr = ArrayUtility.inputArray();
        int occ = occurence(numArr);
        System.out.println("Number of occurences of the number in an array is: " + occ);

    }
    public static int  occurence(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find im an array: ");
        int occ =0;
        int num = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){

                occ++;
            }
        }
        return occ;
    }
}
