import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int carId = i;
            pool.submit(() -> {
                System.out.println("Repairing vehicle #" + carId + " by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}