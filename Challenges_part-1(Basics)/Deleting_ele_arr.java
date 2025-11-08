import java.util.Scanner;

public class Deleting_ele_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to deletion of an element from an array");
        int [] arr = ArrayUtility.inputArray();
        System.out.println("Enter the element to be deleted");
        int numDelete = sc.nextInt();
        int [] newArr = DeleteElement(arr,numDelete);
        System.out.println("Here is your new array:");
        ArrayUtility.DisplayArray(newArr);


    }
    public static int[] DeleteElement(int [] arr,int numDelete){
        int occ = OccurenceArray.occurence(arr,numDelete);
        if(occ==0){
            return arr;
        }
        int newSize = arr.length-occ;
        int [] newArr = new int[newSize];
        int i=0 ,j=0;
        while(i<arr.length){
            if(arr[i]!=numDelete){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
