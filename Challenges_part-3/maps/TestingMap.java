package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestingMap {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();
        country.put("Bharat","New Delhi");
        country.put("Pakistan","Lahore");
        country.put("China","Beijing");
        country.put("Bangladesh","Dhaka");
        country.put("Sri Lanka","Colombo");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the country name: ");
        String countryy = input.next();
        if (country.containsKey(countryy)){
            System.out.printf("%s",country.get(countryy));
        }

    }
}
