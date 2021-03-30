package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Pisica {

    private String species;
    private String name;

    public Pisica(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pisica pisica = (Pisica) o;
        return Objects.equals(species, pisica.species) &&
                Objects.equals(name, pisica.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, name);
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pisica pisi1 = new Pisica("Birmaneza", "Mittens");
        Pisica pisi2 = new Pisica("Birmaneza", "Felix");
        Pisica pisi3 = new Pisica("Europeana", "Pisi");

        List<Pisica> pisicaList = new ArrayList<>();
//        pisicaList.add(pisi1);
//        pisicaList.add(pisi2);
//        pisicaList.add(pisi3);
//
        pisicaList.addAll(Arrays.asList(pisi1, pisi2, pisi3));

        boolean expression = pisicaList.stream()
                .anyMatch(pisica -> pisica.getName().equals("Mittens"));
        System.out.println(expression);

        long count = pisicaList.stream()
                .filter(pisica -> pisica.getSpecies().equals("Birmaneza"))
                .count();
        System.out.println(count);

        List<Pisica> newList =  pisicaList.stream()
                .filter(pisica -> pisica.getName().equals("Felix"))
                .collect(Collectors.toList());

        for(Pisica pisica : newList) {
            System.out.println(pisica.getName());
        }
        String numePisici = pisicaList.stream()
                .map(pisica -> pisica.getName())
                .findFirst()
//                .orElseThrow(() -> new RuntimeException()) // putem arunca exceptie cand elementul este null
                .orElse("defaultString"); // daca elementul din interior este null atunci returneaza - "defaultString"

    }
}
