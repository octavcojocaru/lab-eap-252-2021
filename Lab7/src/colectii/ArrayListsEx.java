package colectii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListsEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("element from arrayList2");

        arrayList1.add("element1");
        arrayList1.addAll(arrayList2); // arraylist1 are 2 elemente: element1" "element from arrayList2"


        List<String> modifiedList = arrayList1.stream()
                .map(element -> element.toUpperCase()) // aplicam toUpperCae pe fiecare element String
//                .map(String::toUpperCase) // putem folosi si method reference: String::toUpperCase - metoda ia un parametru de tip String
                .collect(Collectors.toList()); // le salvam intr-o noua lista

        for (String str : modifiedList) {
            System.out.println(str);
        }


        System.out.println(forEachExercise(arrayList1));

        // la momentul asta avem 2 elemente "element1" "element from arrayList2"
        arrayList1.removeIf(element -> element.endsWith("2")); // removeIf aplica un Predicate - in cazul nostru stergem elementul "element from arrayList2"

        for (String str : arrayList1) {
            System.out.println(str);
        }

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("one");
        arrayList3.add("two");
        arrayList3.add("three");

        // iterare cu Iterator
        Iterator<String> iterator = arrayList3.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

    }

    static String forEachExercise(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(element -> stringBuilder.append(element));

        return stringBuilder.toString();
    }
}
