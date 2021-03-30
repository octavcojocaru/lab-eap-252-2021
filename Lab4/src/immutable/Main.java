package immutable;

public class Main {

    public static void main(String[] args) {
        long[] array = {1L, 500L, 1000L};
        ImmutableObject object = new ImmutableObject(10, 100, array);

        object.getArray()[0] = 0L;

        System.out.println(array[0]); // constatam ca avem referinta catre alt array
    }

}
