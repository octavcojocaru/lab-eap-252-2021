package lab.polymorphism.abstractexample;

public class ImplementationSubClass extends AbstractClass{


    public ImplementationSubClass(int memberField) { // identic constructor
        super(memberField);
    }

    @Override
    public void method1() { // trebuie neaparat sa facem override la metoda abstracta din AbstractClass
        System.out.println("Hello from Implementation class");
    }

}
