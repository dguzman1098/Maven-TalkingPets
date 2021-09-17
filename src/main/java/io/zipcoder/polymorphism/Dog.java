package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("Woof!");
    }
}
