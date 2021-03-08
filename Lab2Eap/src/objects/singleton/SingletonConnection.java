package objects.singleton;

public class SingletonConnection {

    private int upTime;
    private String properties;

    private static SingletonConnection singletonConnection;

    private SingletonConnection() { // private constructor so object cannot be instantiated outside this class
        this.upTime = 100;
        this.properties = "properties";
    }

    public static SingletonConnection getInstance() { // getting the reference to the singleton object through this static method
        if(singletonConnection != null) {
            singletonConnection = new SingletonConnection();
        }
        return singletonConnection;
    }

}
