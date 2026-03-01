package FunctionalProgramming;

import java.util.List;

public class StreamString {
    public static void main(String[] args) {
        List<String> names = List.of("Sudhanshu","Samarht","Aditya","Moulik","Anmol");
        names.stream()
                .forEach(name-> System.out.println(name));
    }
}
