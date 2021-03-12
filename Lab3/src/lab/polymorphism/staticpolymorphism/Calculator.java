package lab.polymorphism.staticpolymorphism;

public class Calculator {

    // fields

    public Calculator() {

    }

    public Calculator(String str1, String str2) {
        // implementation
    }

    public Calculator(String str1, String str2, String str3) {
        // implementation
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public float add(float a, float b) { // Clarificare: metoda nu este supraincarcata pentru ca tipul returnat este diferit
        return a + b;
    }

    /*overloading = supraincarcare  - pastram acelasi nume
                                    - avem o lista de parametri diferita
                                    - tipul returnat nu face parte din semnatura metodei

     */

}
