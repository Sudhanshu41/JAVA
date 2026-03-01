package in.darkdevil.lambda.filterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Cherry","DryFruit");
        System.out.println(fruits.size());
        System.out.println("Printing fruits normally");
        for (String fruit :fruits ){
            System.out.println(fruit);
        }
        System.out.println("Printing fruits using Streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Printing fruits using filter Streams");
        fruits.stream()
             .filter(fruit -> fruit.endsWith("a"))
             .forEach(fruit -> System.out.println(fruit) );

    }
}
