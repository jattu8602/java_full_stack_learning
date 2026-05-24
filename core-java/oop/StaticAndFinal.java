public class StaticAndFinal {
    // static: belongs to the class, not instances
    static int objectCount = 0;

    // final: cannot be reassigned (constant)
    final String instanceName;

    static final double PI = 3.14159;  // constant (class-level)

    public StaticAndFinal(String name) {
        this.instanceName = name;
        objectCount++;  // shared across all instances
    }

    // static method
    static void showCount() {
        System.out.println("Objects created: " + objectCount);
    }

    public void showDetails() {
        System.out.println("Instance: " + instanceName + " (PI = " + PI + ")");
    }

    public static void main(String[] args) {
        StaticAndFinal obj1 = new StaticAndFinal("First");
        StaticAndFinal obj2 = new StaticAndFinal("Second");
        StaticAndFinal obj3 = new StaticAndFinal("Third");

        obj1.showDetails();
        obj2.showDetails();

        // Access static method via class name (preferred)
        StaticAndFinal.showCount();
    }
}
