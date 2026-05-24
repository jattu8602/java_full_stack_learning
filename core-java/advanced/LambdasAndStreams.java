import java.util.*;
import java.util.stream.*;

public class LambdasAndStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // ---- Lambda expressions ----
        // Before lambdas (anonymous class)
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        // After lambdas
        names.sort((a, b) -> a.length() - b.length());
        System.out.println("Sorted by length: " + names);

        // ---- Stream API (Java 8+) ----
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers, square them, collect to list
        List<Integer> evenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)       // intermediate
            .map(n -> n * n)               // intermediate
            .collect(Collectors.toList()); // terminal
        System.out.println("Even squares: " + evenSquares);

        // Common stream operations
        int sum = numbers.stream()
            .filter(n -> n > 5)
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Sum of numbers > 5: " + sum);

        OptionalDouble avg = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .average();
        System.out.println("Average of evens: " + avg.orElse(0));

        // Reduce
        int product = numbers.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Product of 1-10: " + product);

        // Parallel stream (uses multiple threads)
        long count = numbers.parallelStream()
            .filter(n -> n > 3)
            .count();
        System.out.println("Count > 3 (parallel): " + count);
    }
}
