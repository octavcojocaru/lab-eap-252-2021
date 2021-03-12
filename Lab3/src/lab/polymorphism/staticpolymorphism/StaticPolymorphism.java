package lab.polymorphism.staticpolymorphism;

public class StaticPolymorphism {

    public static void main(String[] args) {
        System.out.println(100 + 20); // + operator overloading - aduna numere intregi
        System.out.println(0.5f + 10.3f); // - '' - aduna numere float
        System.out.println("String 1 " + "String 2"); // + concatenare String-uri
        System.out.println(100 + " Final String"); // numarul se transforma in String, urmat de concatenare
    }
}
