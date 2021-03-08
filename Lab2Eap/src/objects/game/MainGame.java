package objects.game;

public class MainGame {

    public static void main(String[] args) {
        Game game1 = new Game("Solitaiere", "Cards", 1960);
        Game game2 = new Game(game1);
    }

}
