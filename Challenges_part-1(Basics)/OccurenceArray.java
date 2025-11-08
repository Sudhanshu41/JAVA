import java.util.Scanner;

public class OccurenceArray {
    public static void main(String[] args) {
        System.out.println("Welcome to number of occurences in an array");
        int [] numArr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find im an array: ");
        int num = sc.nextInt();

        int occ = occurence(numArr,num);
        System.out.println("Number of occurences of the number in an array is: " + occ);

    }
    public static int  occurence(int [] arr,int num){

        int occ =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){

                occ++;
            }
        }
        return occ;
    }
}
