package lab.polymorphism.staticpolymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 3));
        System.out.println(calculator.add(4, 6, 8));
        System.out.println(calculator.add(1, 5, 7, 5));
    }
}
