package in.darkdevil.lambda.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of();
        Optional<Integer> newSum = numbers.stream()
                .reduce(Integer::sum);
        if (newSum.isPresent()){
            System.out.println(newSum.get());
        }
        else {
            System.out.println("List is Empty");
        }
    }
}
