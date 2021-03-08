package objects.book;

public class BookApp {

    public static void main(String[] args) {
        Book book = new Book("Poezii", "Mihai Eminescu", "sdsadsad999", 200);

        Book book2 = new Book(book); // book2 points to the object referenced by book

        book.setTitle("New Title"); // book is changed and so is book2

        System.out.println("Book2 title: " + book2.getTitle()); // book2's title gets changed

    }
}
