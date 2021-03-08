package objects;

public class Cana {

    String culoare;
    float volum;
    boolean areManer;

    Cana() { // constructor fara parametri

    }

    Cana(String culoare, float volum, boolean areManer) { //constructor cu parametri
        this.culoare = culoare;
        this.volum = volum;
        this.areManer = areManer;
    }

    Cana(String culoare) { //constructor cu parametri
        this.culoare = culoare;
        this.volum = 30.0f;
        this.areManer = false;
    }


}
