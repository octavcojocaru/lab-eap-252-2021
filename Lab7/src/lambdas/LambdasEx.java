package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Element one");
        list.add("Element Two");
        list.add("Element Three");
        list.add("element four");
        list.add("element four");
        list.add("element five");

       List<MyObject> objectList =  list.stream()
                .distinct() // pastram doar elementele unice
                .filter(element -> Character.isUpperCase(element.charAt(0))) // pastram doar elementele care incep cu litera mare
                .map(element -> new MyObject(element)) // transformam fiecare element de tip String intr-un obiect de tip MyObject
//              .map(MyObject::new) // sau putem folosi method reference (element este de tip String si constructorul obiectului accepta un param de tip String)
                .collect(Collectors.toList()); // salvam intr-o lista

       for(MyObject obj : objectList) {
           System.out.println(obj.value);
       }
    }
}
