// ---- Base class ----
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

// ---- Derived class (Inheritance) ----
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Call parent constructor
    }

    @Override  // Method overriding (Polymorphism)
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    // Dog-specific method
    public void wagTail() {
        System.out.println(name + " wags tail");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        // Polymorphism: parent reference, child object
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.speak();   // Calls Dog's speak()
        myCat.speak();   // Calls Cat's speak()

        // Casting to access child-specific methods
        if (myDog instanceof Dog) {
            ((Dog) myDog).wagTail();
        }

        // instanceof check
        System.out.println("myDog is Dog: " + (myDog instanceof Dog));
        System.out.println("myDog is Animal: " + (myDog instanceof Animal));
    }
}
