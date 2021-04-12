package colectii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null); // permite null-uri (doar 1)
        set.add("one");
        set.add("two");
        set.add("three");

        for (String val : set) {
            System.out.println(val);
        }

        String[] array = {"a", "b", "c", "a", "B", "c"};
        String[] modifiedArray = removeDuplicatesFromArray(array);
        for (String str: modifiedArray) {
            System.out.print(str + ", ");
        }
    }

    static String[] removeDuplicatesFromArray(String[] array) {
        // Idee de solutie: Convertim array-ul in lista apoi cream un HashSet care va scapa de duplicate; apoi reconvertim in array;
        return new HashSet<>(Arrays.asList(array)).toArray(new String[0]);
    }
}
