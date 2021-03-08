package objects;

public class Main {

    public static void main(String[] args) {
        Furculita furculita1 = new Furculita(); // initial values inside the object are set: null or primitive 0

        System.out.println(furculita1.culoare);
        System.out.println(furculita1.material);
        System.out.println(furculita1.nrDinti);

        Cana cana1 = new Cana("rosu", 300.0f, true);

        System.out.println("Volum: " + cana1.volum);
        System.out.println("Culoare" + cana1.culoare);
        System.out.println("Are maner: " + cana1.areManer);


        Scaun scaun = new Scaun(5, "plastic", true, true);
        scaun.inaltaScaun();
        System.out.println("Noua inaltime este: " + scaun.inaltime);

    }

}
