package lab.polymorphism.dynamicpolymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", "unknown");
        Dog dog = new Dog("dog", "dog");
        ScottishTerrier scottishTerrier = new ScottishTerrier("Scottish", "dog");

        animal.eat();
        dog.eat();
        scottishTerrier.eat(); // mostenita din Dog

        Animal animalDog = new Dog("dog", "dog"); // Animal - tip declarat, Dog - tip real

        animalDog.eat(); // metoda - foloseste tipul real - implementarea din clasa Dog

        Animal animalDog2 = new Dog("dog2", "dog2");

        System.out.println("Animal description: " + animalDog2.description); // se foloseste tipul declarat cand se acceseaza campuri membre

    }
}
