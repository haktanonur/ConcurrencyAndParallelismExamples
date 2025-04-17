import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Fixing engine...");
                    return 10;
                })
                .thenApply(work -> {
                    System.out.println("Multiplying effort...");
                    return work * 2;
                })
                .thenAccept(result -> System.out.println("Final work result: " + result));

        System.out.println("Main thread is doing other work...");

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}