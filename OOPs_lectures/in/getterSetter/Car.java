package in.getterSetter;

public class Car {
    private String color;  // public
    private String model;  // public
    private  double fuel;
    private long costOfPurchase;  // default

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }


    public Car(long costOfPurchase, double fuel, String model, String color) {
        this.costOfPurchase = costOfPurchase;
        this.fuel = fuel;
        this.model = model;
        this.color = color;
    }
}
