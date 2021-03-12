package lab.objects;

import java.util.Objects;

/*
     All objects in Java extend Object.class
     Here we will override some Object methods
 */
public class MyObject {

    int field1 = 0;

    @Override
    public boolean equals(Object o) { // equals suprascrisa
        if (this == o) return true; // this - obiectul curent
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return field1 == myObject.field1; // se compara fieldurile membre
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1); // we can also hash multiple fields here
    }

    @Override
    public String toString() { // overriding toString method in order to have a more representative output
        return "MyObject: " + "field1 = " + field1;
    }

}
