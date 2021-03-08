package objects.book;

public class Book {

    private String title;
    private String auhor;
    private String isbn;
    private int noOfPages;

    public Book(String title, String auhor, String isbn, int noOfPages) {
        this.title = title;
        this.auhor = auhor;
        this.isbn = isbn;
        this.noOfPages = noOfPages;
    }

    public Book(Book book) {
        this.title = book.title;
        this.auhor = book.auhor;
        this.isbn = book.isbn;
        this.noOfPages = book.noOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuhor() {
        return auhor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuhor(String auhor) {
        this.auhor = auhor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }


    public String toString() {
        return "title :" + title + " author: " + auhor;
    }

}
