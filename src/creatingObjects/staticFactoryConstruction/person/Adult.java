package creatingObjects.staticFactoryConstruction.person;

import java.util.ArrayList;
import java.util.List;

public class Adult implements Person{
    private String name, surname;
    private int age;

    private Adult(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected static Adult of(String name, String surname, int age){
        Adult adult = new Adult(name, surname, age);
        return adult;
    }

    @Override
    public void greet() {
        System.out.println("Hello, My name is " + name + " " + surname);
    }
}
