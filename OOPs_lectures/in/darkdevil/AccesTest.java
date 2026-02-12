package in.darkdevil;



public class AccesTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        System.out.println(car);
        Car newcar = new Car("Black","BMW",4.5,234567);
        System.out.println(newcar);


    }
}
