package objects.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonConnection conn1 = SingletonConnection.getInstance();
        SingletonConnection conn2 = SingletonConnection.getInstance();

        System.out.println(conn1 == conn2); // == compara referinta // equals compara valorile obiectului
    }
}
