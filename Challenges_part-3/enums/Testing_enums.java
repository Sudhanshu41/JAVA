package enums;

public class Testing_enums {
    public static void main(String[] args) {
        Day day =Day.THURSDAY;
        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n",value,value.getAction());
        }

    }
}
