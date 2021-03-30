package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists { // listele sunt ordonate si permit dubluri

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(); // cream o lista de tip String
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        // interam prin lista cu for

        for(String element: myList) {
            System.out.println(element);
        }

        // sau putem folosi iteratorIterator

        Iterator<String> iterator = myList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
