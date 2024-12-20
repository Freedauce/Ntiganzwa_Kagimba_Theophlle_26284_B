// ClassCastException.java
/**
 * This program demonstrates handling a ClassCastException caused by an invalid type cast.
 */

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        class Animal {
            void sound() {
                System.out.println("This is an animal.");
            }
        }
        class Dog extends Animal {
            @Override
            void sound() {
                System.out.println("Bark!");
            }
        }
        class Cat extends Animal {
            @Override
            void sound() {
                System.out.println("Meow!");
            }
        }

        Animal myAnimal = new Dog();
        myAnimal.sound();

        try {
            Cat myCat = (Cat) myAnimal; // This will throw ClassCastException
            myCat.sound();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}