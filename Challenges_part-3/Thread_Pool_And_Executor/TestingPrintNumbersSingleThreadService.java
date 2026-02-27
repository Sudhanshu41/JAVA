package Thread_Pool_And_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingPrintNumbersSingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            printNumbers task = new printNumbers();
            service.submit(task);

        }
    }
}
