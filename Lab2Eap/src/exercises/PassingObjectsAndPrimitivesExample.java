package exercises;

import objects.book.Book;

public class PassingObjectsAndPrimitivesExample {

    public static void main(String[] args) {
        int a = 1;
        changePrimitive(a); // a does not change

        System.out.println(a);

        Integer a2 = 2;

        changeWrapperObject(a2);  // a2 does not change

        System.out.println(a2);

        int[] numbers = {1, 3, 5, 7, 9};

        alterArray(numbers); // array is altered

        System.out.println(numbers[1]);

        Book book = new Book("Title", "author", "isbn", 200);
        alterBook(book); // book properties get changed
        System.out.println(book.getTitle());

        Book book2 = new Book("Title", "author", "isbn", 200);
        alterBookNewObj(book2); // book2 does not get changed as a new reference is assigned inside the method

        System.out.println(book2);

    }

    static void alterBookNewObj(Book book) {
        book = new Book("Other title", "other author", "other isbn", 300);
    }

    static void alterBook(Book book) {
        book.setTitle("New title");
    }

    static void alterArray(int[] array) {
        array[1] = 20;
    }

    static void changeWrapperObject(Integer number) {
        number = 100;
    }

    static void changePrimitive(int number) {
        number = 100;
    }
}
