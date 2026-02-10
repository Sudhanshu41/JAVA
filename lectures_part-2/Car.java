public class Car {
    static  int noOfCarsSold;
    int nOfWheels;    // these are attributes or properties.
     String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;
    static {
          noOfCarsSold = 0;
        System.out.println("I am In Static block");
    }
    static {
        noOfCarsSold++;
        System.out.println("I am in init block");
    }
    Car(String color){
        nOfWheels=4;
        this.color=color;
        maxSpeed= 150;
        currentFuelInLitres=2;
        noOfSeats=5;
    }
    Car(){
       this("white");
    }
    public Car start(){
        if (currentFuelInLitres == 0) {
            System.out.println("Car is out of fuel, can not start");
        }// these are methods
        else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserved mode, please refuel");

        } else {
            System.out.println("Car is started");

        }
        return this;
    }
    public void drive() {
            currentFuelInLitres--;
            System.out.println("Car is driving");

        }



    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres+=currentFuelInLitres;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }
}
