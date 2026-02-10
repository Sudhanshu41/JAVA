import java.util.Scanner;

public class recurs2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to palindrome checker!!");
        System.out.print("Enter the string to be checked: ");
        String str=sc.nextLine();
        System.out.println("Your string is: "+(isPalindrome(str)?"Palindrome":"Not Palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int last = str.length()-1;
        if(str.charAt(0)!=str.charAt(last)){
            return false;
        }
        String newstr = str.substring(1, last);
        return isPalindrome(newstr);
    }
}
