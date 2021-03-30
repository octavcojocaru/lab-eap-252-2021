package interfaces.cloneable;

public class CloneableClass implements Cloneable { // pentru ca un obiect sa fie cloneable trebuie sa implementeze interfata marker Cloneable

    private int a;
    private int b;

    public CloneableClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b;
    }

    @Override
    public CloneableClass clone() throws CloneNotSupportedException { // cand implementam Cloneable sa si suprascriem metoda clone
        return new CloneableClass(a, b);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableClass cloneableClass = new CloneableClass(1, 2);
        CloneableClass clone = (CloneableClass) cloneableClass.clone(); // daca folosim metoda clone() al clasei Object trebuie sa facem cast
        System.out.println(clone);

        CloneableClass clone2 = cloneableClass.clone();
        System.out.println(clone2);
    }
}
