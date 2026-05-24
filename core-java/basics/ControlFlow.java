public class ControlFlow {
    public static void main(String[] args) {
        int score = 85;

        // ---- if-else ----
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // ---- switch (modern syntax, Java 14+) ----
        String day = "MONDAY";
        String type = switch (day) {
            case "SATURDAY", "SUNDAY" -> "Weekend";
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            default -> "Invalid";
        };
        System.out.println(day + " is a " + type);

        // ---- for loop ----
        System.out.print("For loop: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // ---- while loop ----
        System.out.print("While loop: ");
        int k = 0;
        while (k < 5) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();

        // ---- do-while loop ----
        System.out.print("Do-while: ");
        int m = 0;
        do {
            System.out.print(m + " ");
            m++;
        } while (m < 5);
        System.out.println();

        // ---- for-each (enhanced for loop) ----
        int[] arr = {10, 20, 30, 40};
        System.out.print("For-each: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
