package javaapplicationt3;

import java.util.Date;

public class Animal {

    private String id;
    private String source;
    private Date dateOfBirth;
    private String color;

    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    
    public void makeSound() {
        System.out.println("Animal sound");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Source: " + source + ", Date of Birth: " + dateOfBirth + ", Color: " + color;
    }
}
