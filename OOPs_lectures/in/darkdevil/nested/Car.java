package in.darkdevil.nested;

public class Car {
    private int noOFDoors;
    protected class Tyre{
       private double width;
       private double pressure;
       private String material;
       public void Inflate(){
           noOFDoors = 4;
       }
    }
    public void repair(){
        Tyre t = new Tyre();
    }
}
