package FunctionalProgramming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FPfactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want factorial off: ");
        int num = input.nextInt();
        IntStream.rangeClosed(2,num)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);
    }

}
