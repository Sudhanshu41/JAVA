package Thread_Pool_And_Executor;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class factorial implements Callable<Long> {
    private final int number;
    public factorial(int number) {
        this.number = number;
    }

    @Override


    public Long call() throws Exception {
       Thread.sleep(3000);

        long result = fact(number);
        return result ;
    }
    public static long fact(int num){
        if (num==0 || num==1){
            return 1;
        }
        return num*fact(num-1);

    }
}
