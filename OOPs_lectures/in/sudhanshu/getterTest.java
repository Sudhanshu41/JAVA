package in.sudhanshu;

import in.getterSetter.Car;

public class getterTest {
    public static void main(String[] args) {
        Car car = new Car(4500,2,"Swift","Red");
        car.setColor("Blue");
        System.out.printf("%s %s ",car.getColor(),car.getModel());
    }
}
