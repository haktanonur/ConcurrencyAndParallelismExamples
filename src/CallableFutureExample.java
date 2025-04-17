import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            Thread.sleep(500);
            return "Engine fixed!";
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> result = executor.submit(task);

        System.out.println("Waiting for result...");
        System.out.println("Result: " + result.get());

        executor.shutdown();
    }
}
