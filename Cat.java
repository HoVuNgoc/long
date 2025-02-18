
package javaapplicationt3;
import java.util.Date;

public class Cat extends Animal {
    private String breed;

    public Cat(String id, String source, Date dateOfBirth, String color, String breed) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}