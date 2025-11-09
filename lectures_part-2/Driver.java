import java.util.Date;

public  class  Driver {
    static int minAge = 18;
    int age;
    String name;
    String Date;
public boolean isAllowed(){
        return this.age>=minAge;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        System.out.println(myCar.getCurrentFuelLevel());
         Car swift = new Car("blue");
         Car thar = new Car();
         //swift.addFuel(6);
         swift.start().drive();
        System.out.println(swift.color);
        System.out.println(thar.color);
//         Driver myDriver = new Driver();
//         myDriver.Date = "01/01/2024";
//        System.out.println("minimum age of driving is: "+minAge);



    }
}
