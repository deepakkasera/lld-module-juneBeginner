package designpatterns.singleton.syncronized;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    private DataBaseConnection() {}

    public synchronized static DataBaseConnection getInstance() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }
}

//this implementation will work in Multithreaded environment.
//Performance is not good.
