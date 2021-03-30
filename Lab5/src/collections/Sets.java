package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets { // seturile sunt neordonate si nu permit dubluri

    public static void main(String[] args) {
        Set<Pisica> pisicaSet = new HashSet<>(); // cream o lista de tip Pisica
        Pisica pisica1 = new Pisica("Birmaneza", "Mittens");
        Pisica pisica2 = new Pisica("Birmaneza", "Felix");
        Pisica pisica3 = new Pisica("Europeana", "Pisi");
        Pisica pisica4 = new Pisica("Europeana", "Pisi");

        pisicaSet.addAll(Arrays.asList(pisica1, pisica2, pisica3, pisica4)); // nu se adauga dublurile, deci vom avea 3 pisici

        for(Pisica pisica: pisicaSet) {
            System.out.println(pisica);
        }
    }
}
