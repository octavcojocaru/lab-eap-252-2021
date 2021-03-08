package objects.book;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Amintiri din Copilarie", "Ion Creanga", "IEOISO38883", 250);
        System.out.println(book1.getAuhor());
        book1.setAuhor("Marin Preda");
        System.out.println(book1.getAuhor());
        // changing author name

        Book book2 = new Book("Poezii", "Mihai Eminescu", "sdsadsad999", 200);

        book1 = book2; // book1 points to the object referenced by book2

        System.out.println("New book 1 author: " + book1.getAuhor());
        Book book3 = new Book(book2); // book3 initialized by copy constructor so it's not tied to book2

        book2.setTitle("Poezii Vol 2");


        System.out.println("New book 1 title: " + book1.getTitle()); // references book2 object; prints "Poezii Vol 2"

        System.out.println("New book 3 title: " + book3.getTitle()); // prints "Poezii"



    }
}
