public class BasicThreadExample {
    public static void main(String[] args) {
        Thread task = new Thread(() -> {
            System.out.println("Craftsman is working on a vehicle: " + Thread.currentThread().getName());
        });

        task.start();
    }
}