package FunctionalProgramming;

import java.util.List;

public class StreamStringFilter {
    public static void main(String[] args) {
        List<String> names = List.of("Sudhanshuhjdshfs","Samarhtfsfsf","Aditya","Moulik","Anmol");
       String result = names.stream()
                .filter(name->name.length()<=10)
                .reduce("",(a,b)->a+" "+b);

        System.out.println(result);
                    }
}
