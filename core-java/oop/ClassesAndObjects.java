// A simple class representing a Student
class Student {
    // Fields (attributes)
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and Setters (Encapsulation)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    // Method
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Create objects (instances)
        Student alice = new Student("Alice", 20, "A");
        Student bob = new Student("Bob", 22, "B");

        alice.displayInfo();
        bob.displayInfo();

        // Using setters
        bob.setGrade("A");
        System.out.println(bob.getName() + "'s new grade: " + bob.getGrade());
    }
}
