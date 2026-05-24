import java.util.Arrays;

public class ArraysAndStrings {
    public static void main(String[] args) {
        // ---- Arrays ----
        int[] numbers = new int[3];      // Fixed size
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println("Array: " + Arrays.toString(numbers));

        int[] literal = {5, 3, 1, 4, 2};
        Arrays.sort(literal);                            // In-place sort
        System.out.println("Sorted: " + Arrays.toString(literal));

        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Matrix[1][2]: " + matrix[1][2]);

        // ---- Strings ----
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1 + " " + str2;             // Concatenation
        System.out.println("Combined: " + combined);

        // Useful String methods
        System.out.println("Length: " + combined.length());
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Substring: " + combined.substring(0, 5));
        System.out.println("Contains 'World': " + combined.contains("World"));
        System.out.println("Replace: " + combined.replace("World", "Java"));

        // StringBuilder (mutable, efficient for many modifications)
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> middle");
        sb.append(" -> end");
        System.out.println("StringBuilder: " + sb.toString());
    }
}
