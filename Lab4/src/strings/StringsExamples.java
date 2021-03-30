package strings;

public class StringsExamples {

    public static void main(String[] args) {
        String string1 = "abc"; // String este nu este mutabil
        string1.toUpperCase(); // se returneaza o referinta noua de tip String

        System.out.println(string1); // String nu este mutabil, asa ca obiectul nu se modifica dupa apelarea metodei toUpperCase()

        String string2 = "myString"; // valoarea string-ului se adauga in String Pool

        String string3 = "myString"; // se uita in String Pool si cauta acest String

        System.out.println(string2 == string3); // comparam referintele -

        String string4 = new String("myString");
        String string5 = new String("myString");

        System.out.println(string4 == string5); // comparam referintele - string4 si string5 au referinte diferite (prin new)


    }

}
