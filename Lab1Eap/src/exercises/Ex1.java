package exercises; // the package where our class is

public class Ex1 { // public = accessible from all packages

    public static void main(String[] args) {

        byte b; // declarare
        b = 2; // atribuire

        byte b2 = 2; // declarare si atribuire

        byte b3 = 3, b4 = 4; // declarare si atribuire multipla

        int i = 5;

        int base2Int = 0b101; // base 2 (0b prefix)
        int base8Int = 011; // base 8 (0 prefix)
        int base16Int = 0x10; // base 16 (0x prefix)

        long l = 9999;
        long l2 = 99999999999L;


        float f = 32.455f;
        double d = 32.256d;

        boolean bool1 = false;
        boolean bool2 = true;

        char c = 'G';
        char c2 = '\u006D';

        System.out.println(c2);


        Integer integerWrapper = 2; // boxing

        int intPrimitive = integerWrapper + 2; // unboxing

    }

}
