import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // ---- List (ordered, allows duplicates) ----
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // duplicate allowed
        System.out.println("List: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));

        // ---- Set (no duplicates) ----
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);  // ignored
        numbers.add(30);
        System.out.println("Set: " + numbers);

        // Sorted set
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Mango");
        System.out.println("TreeSet (sorted): " + sortedSet);

        // ---- Map (key-value pairs) ----
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println("Map: " + ages);
        System.out.println("Alice's age: " + ages.get("Alice"));

        // Iterating over a map
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
        }

        // ---- Queue ----
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue poll: " + queue.poll());  // removes "First"
        System.out.println("Queue peek: " + queue.peek());  // sees "Second"

        // ---- Utility methods ----
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}
