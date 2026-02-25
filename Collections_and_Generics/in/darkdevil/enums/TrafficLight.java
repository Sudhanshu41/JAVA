package in.darkdevil.enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Slow Down");
    private final String action;
    TrafficLight(String action){
        this.action =  action;
    }
}
