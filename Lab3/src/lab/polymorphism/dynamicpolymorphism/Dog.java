package lab.polymorphism.dynamicpolymorphism;

public class Dog extends Animal {// Dog IS-a Animal - relatie

    boolean isTrained = true;

    String description = "Dog"; // shadowing la variabila membra e superclasei

    public Dog(String name, String specie) {
        super(name, specie);
    }

    public void eat() { // modificatorul de acces al metodei suprascrise poate fi la fel sau mai permisiv ca cel al metodei superclasei
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

}
