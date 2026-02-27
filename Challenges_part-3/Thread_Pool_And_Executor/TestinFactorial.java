package Thread_Pool_And_Executor;

import java.util.concurrent.*;

public class TestinFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(1)) {
            factorial task1 = new factorial(5);
            factorial task2 = new factorial(4);
            factorial task3 = new factorial(6);
            factorial task4 = new factorial(7);
            Future<Long> num1 = service.submit(task1);
            Future<Long> num2 = service.submit(task2);
            Future<Long> num3 = service.submit(task3);
            Future<Long> num4 = service.submit(task4);
            System.out.printf("\nFactorial  of 5 is: %d ",num1.get());
            System.out.printf("\nFactorial  of 4 is: %d ",num2.get());
            System.out.printf("\nFactorial  of 6 is: %d ",num3.get());
            System.out.printf("\nFactorial  of 7 is: %d ",num4.get());

            service.shutdown();
             if (!service.awaitTermination(8, TimeUnit.SECONDS)){
                 service.shutdown();
             }

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
