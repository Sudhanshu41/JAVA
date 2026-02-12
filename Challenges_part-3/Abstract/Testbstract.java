package Abstract;

import java.util.Scanner;

public class Testbstract{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        Shape cir = new Circle(input.nextDouble());
       cir.calculateArea();

        System.out.println("Enter the side of the square: ");
        Shape sq = new Square(input.nextInt());

        sq.calculateArea();
    }


}
