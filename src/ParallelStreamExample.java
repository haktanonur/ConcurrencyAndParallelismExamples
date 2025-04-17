import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> vehicles = Arrays.asList(1, 2, 3, 4, 5);

        int total = vehicles.parallelStream()
                .map(vehicle -> {
                    System.out.println("Working on vehicle #" + vehicle +
                            " by " + Thread.currentThread().getName());
                    return vehicle * 2;
                })
                .reduce(0, Integer::sum);

        System.out.println("Total result: " + total);
    }
}