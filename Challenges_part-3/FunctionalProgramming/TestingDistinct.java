package FunctionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,3,2,4,6);
        List<Integer> distinctNumbers = number.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(number);
        System.out.println(distinctNumbers );

    }
}
