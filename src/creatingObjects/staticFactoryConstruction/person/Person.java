package creatingObjects.staticFactoryConstruction.person;

public interface Person {

    static Person of(String name, String surname, int age){
        if(age <= 1){
            return Baby.of(name, surname, age);
        }
        else if(age < 18){
            return Kid.of(name, surname, age);
        }
        else{
            return Adult.of(name, surname, age);
        }
    }

    void greet();
}
