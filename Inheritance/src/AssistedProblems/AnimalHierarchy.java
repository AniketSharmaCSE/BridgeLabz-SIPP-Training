package AssistedProblems;

public class AnimalHierarchy {
    
    // Superclass
    static class Animal {
        String name;
        int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void makesound() {
            System.out.println(name + " makes a sound");
        }
    }

    // Dog subclass
    static class Dog extends Animal {
        Dog(String name, int age) {
            super(name, age);
        }

        void makesound() {
            System.out.println(name + " makes a sound of woof");
        }
    }

    // Cat subclass
    static class Cat extends Animal {
        Cat(String name, int age) {
            super(name, age);
        }

        void makesound() {
            System.out.println(name + " makes a sound of meow");
        }
    }

    // Main method
   
}
