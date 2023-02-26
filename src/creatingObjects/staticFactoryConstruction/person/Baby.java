package creatingObjects.staticFactoryConstruction.person;

public class Baby implements Person{
    private String name, surname;
    private int age;

    private Baby(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected static Baby of(String name, String surname, int age){
        Baby baby = new Baby(name, surname, age);
        return baby;
    }

    @Override
    public void greet(){
        System.out.println("Buaaaaahhhhh");
    }
}
