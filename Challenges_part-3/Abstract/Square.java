package Abstract;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of square is: "+Math.pow(side,2));
    }
}
