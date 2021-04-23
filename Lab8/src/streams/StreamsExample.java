package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "CCCC";
        String s4 = "";
        String s5 = "";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Stream<String> stringStream = list.stream(); // cream un stream din Lista - procesam fiecare element
        long count = stringStream
                .filter(element -> element.length() == 3)
                .count();

        System.out.println(count);

        list.stream()
                .filter(element -> !element.isEmpty()) // am scapat de elementele care erau empty
                .limit(2) // am limitat numarul de elemente din stream la 2
                .forEach(System.out::println); // operatie de inchidere forEach


        /*
        Operatii intermediare

        filter
        sorted
        limit
        distinct - scapa de duplicatele din stream
        map - transforma stream-ul in alt timp de stream
         */

        /*
        Operatii de inchidere

        forEach
        max
        min
        count
        reduce
         */

        /*
        Collectori - tot operatii de inchidere

        toList
        toSet
        toMap
        joining - spre exemplu: putem salva stream-ul intr-un String
        counting - le numara
         */
    }

}
