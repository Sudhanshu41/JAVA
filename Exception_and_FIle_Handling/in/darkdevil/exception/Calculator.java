package in.darkdevil.exception;

import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {
        a();
    }
    private static void a(){
            b();
    }
    private static void b(){
            c();
    }
    private static void c(){
            d();
    }
    private static void d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator ");
        System.out.println("Please enter your twp numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        try{
            int [] arr = new int[5];
           // System.out.printf("Result is: %d",arr[6]);
//            arr[6] = first/second;
//            System.out.printf("Result is: %d",arr[6]);
        } catch (ArithmeticException exception){

            System.out.printf("%s , enter valid value!!",exception.getMessage());
        }catch (Throwable th ){
            System.out.println("General Exception!!");
            throw th;
        }finally {
            System.out.println("I am in finally");
        }
    }
}
