package immutable;

import java.util.Arrays;
// Imutablitatea - se foloseste compozitia
public final class ImmutableObject { // final - nu poate fi extinsa

    private final int a; // field-urile finale si private
    private final int b;

    private final long[] array;

    public ImmutableObject(int a, int b, long[] array) {
        this.a = a;
        this.b = b;
        this.array = Arrays.copyOf(array, array.length);// tipurile de referinta - trebuie folosite copii
    }

    public int getA() { // declaram doar getteri pentru fielduri
        return a;
    }

    public int getB() {
        return b;
    }

    public long[] getArray() { // in cazul unui getter pe un tip de referinta se va returna o copie
        return Arrays.copyOf(array, array.length);
    }

}
