package creatingObjects.staticFactoryConstruction.person;

import creatingObjects.staticFactoryConstruction.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Kid implements Person {
    private String name, surname;
    private int age;

    private Kid(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected static Kid of(String name, String surname, int age){
        Kid kid = new Kid(name, surname, age);
        return kid;
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm " + name);
    }
}
