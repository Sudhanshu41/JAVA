import java.util.Scanner;

public class Search2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D Search");
        int [][] numArray = ArrayUtility.input2DArray();
        System.out.println("Now enter the number you want to search");
        int num = sc.nextInt();
        boolean isFound = search(numArray,num);
        if (isFound){
            System.out.println("The number you entered is found");
        }
        else {
            System.out.println("The number you entered is not found");
        }

    }
    public static boolean search(int[][] numArray,int num){
        for(int i=0;i<numArray.length;i++){
            for(int j=0;j<numArray[i].length;j++){
                if(numArray[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}
