package lab.polymorphism.dynamicpolymorphism;

public class ScottishTerrier extends Dog{

    public ScottishTerrier(String name, String specie) {
        super(name, specie);
    }

    public void bark() { // since bark method in Dog class is public, we can only use public for the overwritten class
        System.out.println("Scottish Terrier barks");
    }

    public void eat() {
        super.eat(); // apeleaza metoda eat din superclasa (Dog) - ca si cand nu am suprascris-o pentru ca face acelasi lucru
    }
}
