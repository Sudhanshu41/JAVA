package enums;

public enum Day {
    MONDAY("weekday"),TUESDAY("weekday"),WEDNESDAY("weekday"),THURSDAY("weekday"),FRIDAY("weekday"),SATURDAY("weekend"),SUNDAY("weekend");
    private final  String action;
    Day(String action){
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
