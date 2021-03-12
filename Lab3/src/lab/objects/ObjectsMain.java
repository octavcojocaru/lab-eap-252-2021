package lab.objects;

public class ObjectsMain {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyObject object2 = new MyObject();

        System.out.println(object.equals(object2));

        System.out.println("obj1 hashcode: " + object.hashCode() + ", obj2 hashcode: " + object2.hashCode());

        System.out.println(object.hashCode() == object2.hashCode());

        System.out.println(object.getClass());

        System.out.println("Object string representation: " + object.toString());
    }
}
