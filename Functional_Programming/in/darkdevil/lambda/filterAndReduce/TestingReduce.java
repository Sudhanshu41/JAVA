package in.darkdevil.lambda.filterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6);
        int sum = 0;
        for (Integer num : number) {
            sum+= num;
        }
        System.out.println(sum);
        int newSum = number.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.printf("\n Sum using reduce: %d",newSum);

        int newSum1 = number.stream()
                .reduce(0, (a,b)->a+b);
        System.out.printf("\n Sum using lambda reduce: %d",newSum);

        int max = number.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.printf("\n max using lambda reduce: %d",max);

    }
}
