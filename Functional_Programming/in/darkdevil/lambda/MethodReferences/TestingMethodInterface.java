package in.darkdevil.lambda.MethodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6);
        number.stream()
                .filter(num->num%2==1)
                .forEach(System.out::println);// method ko hum 2 colon lagakar reference krte hai
//        number.stream()
//                .filter(num->num%2==1)
//                .forEach(num-> System.out.println(num));

       int newSum1 = number.stream()
                .reduce(0, Integer::sum);

        System.out.printf("\n Sum using lambda reduce: %d",newSum1);



    }
}
