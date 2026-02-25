package in.darkdevil.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Sudhanshu",7);
        map.put("Samarth",10);
        map.put("Aditya",2);
        map.put("Omkar",6);
        System.out.println(map.size());
        System.out.println(map.get("Sudhanshu"));
        System.out.println(map.containsKey("aditya"));
        for (String key : map.keySet()) {
            System.out.printf("%s : %s",key,map.get(key));
        }
    }
}
