package creatingObjects.staticFactoryConstruction;

import creatingObjects.staticFactoryConstruction.person.Person;

public class Client {
    public static void main(String[] args){
        Person adult = Person.of("Marco", "Ulpio Trajano", 30);
        Person kid = Person.of("Tito", "Domiciano", 15);
        Person baby = Person.of("Domicia", "Longina", 1);

        adult.greet();
        kid.greet();
        baby.greet();
    }
}
