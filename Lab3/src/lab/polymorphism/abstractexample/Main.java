package lab.polymorphism.abstractexample;

public class Main {

    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass(); // abstract classes cannot be instantiated !!!
        AbstractClass myClass = new ImplementationSubClass(10);
        myClass.method1();
    }
}
