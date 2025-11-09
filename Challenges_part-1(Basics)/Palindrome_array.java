public class Palindrome_array {
    public static void main(String[] args) {
        System.out.println("Welcome to check if the array is palindrome or not.");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Your array is");
        ArrayUtility.DisplayArray(arr);
       int [] newArr = Reverse_array(arr);
        System.out.println("Your reverse array is ");
        ArrayUtility.DisplayArray(newArr);
        if(isPalindrome(arr,newArr)){
            System.out.println("Your array is a palindrome");
        }
        else{
            System.out.println("Your array is not a palindrome");
        }





    }
    public static int [] Reverse_array(int[] arr){
        int [] rev = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            rev[i] = arr[arr.length-i-1];
        }
        return rev;
    }
    public static boolean isPalindrome(int[] arr,int[] rev){
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=rev[i]){
                return false;
            }
        }
        return true;
    }

}
/*
*class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is Palindrome");
        } else {
            System.out.println("Your array is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
} */
