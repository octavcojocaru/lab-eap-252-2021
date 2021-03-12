package lab.polymorphism.dynamicpolymorphism;

public class Animal {

    private String name;
    private String specie;

    String description = "Animal";

    public Animal(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    protected void eat() {
        System.out.println("Animal eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
