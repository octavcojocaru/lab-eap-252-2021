package lab.polymorphism.abstractexample;

public abstract class AbstractClass { // abstract - clasa nu poate fi instantiata

    int memberField;

    public AbstractClass(int memberField) {
        this.memberField = memberField;
    }

    public abstract void method1(); // no implementation

    public void method2() {
        System.out.println("Method 2 in Abstract Class");
    }

}
