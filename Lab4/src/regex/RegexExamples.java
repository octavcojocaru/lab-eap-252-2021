package regex;

public class RegexExamples {

    public static void main(String[] args) {
        String a = "a";
        String regex = "[a-z]";

        System.out.println(a.matches(regex));

        String regex2 = "[a-zA-Z]";
        System.out.println(a.matches(regex2));


        String b = "MyString1110";
        String regex3 = "[a-zA-Z0-9]{0,12}";

        System.out.println(b.matches(regex3));

        String stringToBeSplit = "The red glint of paint sparkled under the sun. He had dreamed of owning this car since he was ten, and that dream had become a reality less than a year ago. It was his baby and he spent hours caring for it, pampering it, and fondling over it. She knew this all too well, and that's exactly why she had taken a sludge hammer to it.";

        String[] splitString = stringToBeSplit.split("\\."); // \\ - escape character

        for(String str: splitString) {
            System.out.println(str);
        }

        System.out.println(stringToBeSplit.replaceAll("[tT]", "A"));

    }
}
