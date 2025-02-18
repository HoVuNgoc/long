package javaapplicationt3;

import java.util.Date;

public class Dog extends Animal {

    private String breed;

    public Dog(String id, String source, Date dateOfBirth, String color, String breed) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
