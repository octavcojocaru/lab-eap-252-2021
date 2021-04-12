package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx { // Map este un tip Java de tip cheie-valoare (dictionar) - contine chei unice.

    public static void main(String[] args) {
        // cheile si valorile pot fi de orice tip; pentru tipuri primitive (int, char etc) vom folosi clasa wrapper (Integer, Character)
        Map<String, String> map = new HashMap<>(); // declaram un HashMap cu cheia de tip String si valoarea tot de tip String

        map.put("one", "ValueOne");
        map.put("two", "ValueTwo");

        map.put(null, "value"); // permite o singura cheie nula
        map.put("three", null); // permite si valori nule

        iterateThroughKeys(map);

        iterateThroughValues(map);

        iterateThroughEntrySet(map);

        countChars("aaaccbbbcaaapoiuy");

    }

    private static void iterateThroughKeys(Map<String, String> map) {
        Set<String> keySet = map.keySet(); // ca sa iteram prin chei foloseim map.keySet

        for (String key : keySet) { // iteram prin chei
            System.out.print(key + " ");
        }
    }

    private static void iterateThroughValues(Map<String, String> map) {
        Collection<String> values = map.values(); // luam o Colectie de valori

        for (String value : values) {
            System.out.print(value + " ");
        }
    }

    private static void iterateThroughEntrySet(Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet(); // luam un set de tip Entry (cheie : valoare)

        for(Map.Entry<String, String> entry: entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    // Exercitiu: Sa se numere numarul de aparitii al fiecarui caracter dintr-un string folosind HashMap

    static void countChars(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : string.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }

    }
}
