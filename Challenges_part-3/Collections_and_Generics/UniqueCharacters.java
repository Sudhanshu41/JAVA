package Collections_and_Generics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your String: ");
        String userStr = input.next();
        userStr=userStr.toLowerCase();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your String has %d unique Characters",unique.size());
    }
}
