package in.darkdevil;

import in.darkdevil.Inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
   public TwoWheeler(){
        setNumberOfTyres(2);
        numberOfTyres = 2;
    }
    public void Balance(){
        System.out.println("I am Balancing on two tyres.");
    }

}
