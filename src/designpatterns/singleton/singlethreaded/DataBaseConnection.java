package designpatterns.singleton.singlethreaded;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }
}
