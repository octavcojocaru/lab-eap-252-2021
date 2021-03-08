package objects.game;

public class Game {

    private String title;
    private String genre;
    private int publishedYear;

    public Game() {
    }

    public Game(String title, String genre, int publishedYear) {
        this.title = title;
        this.genre = genre;
        this.publishedYear = publishedYear;
    }

    public Game(Game otherGame) { // copy constructor
        this.title = otherGame.genre;
        this.genre = otherGame.genre;
        this.publishedYear = otherGame.publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
