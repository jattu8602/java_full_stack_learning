public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // ---- Primitive Data Types ----
        byte b = 100;           // 8-bit, range: -128 to 127
        short s = 1000;         // 16-bit
        int i = 100000;         // 32-bit (most common for integers)
        long l = 100000L;       // 64-bit, needs 'L' suffix

        float f = 3.14f;        // 32-bit, needs 'f' suffix
        double d = 3.14159;     // 64-bit (default for decimals)

        char c = 'A';           // 16-bit Unicode character
        boolean bool = true;    // true or false

        // ---- Reference Types ----
        String message = "Java is awesome!";
        int[] numbers = {1, 2, 3, 4, 5};

        // ---- Print them out ----
        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + message);
        System.out.println("Array length: " + numbers.length);

        // ---- Type Casting ----
        int fromDouble = (int) d;           // Explicit casting (narrowing)
        double fromInt = i;                 // Implicit casting (widening)
        System.out.println("Casting double to int: " + fromDouble);

        // ---- var keyword (Java 10+) - type inference ----
        var autoType = "This is a String";  // Compiler infers the type
        System.out.println(autoType);
    }
}
