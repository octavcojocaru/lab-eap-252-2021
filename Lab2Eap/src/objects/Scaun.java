package objects;

public class Scaun {

    int nrPicioare;
    String material;
    boolean eDeGaming;
    boolean seRoteste;
    float inaltime;

    public Scaun(int nrPicioare, String material, boolean eDeGaming, boolean seRoteste) { // isRotating, isGaming - boolean name conventions
        this.nrPicioare = nrPicioare;
        this.material = material;
        this.eDeGaming = eDeGaming;
        this.seRoteste = seRoteste;
        this.inaltime = 50.0f;
    }

    public void inaltaScaun() {
        this.inaltime += 10.0f;
    }

}
