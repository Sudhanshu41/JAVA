public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double circumference(){
        return 2*radius*Math.PI;
    }
    double area(){
        return  Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        sb.append("\n Area is= ").append(area());
        sb.append("\n Circumference is = ").append(circumference());

        return sb.toString();
    }

    public static void main(String[] args) {
        Circle c = new Circle(8.7);
        System.out.println(c);
    }
}
