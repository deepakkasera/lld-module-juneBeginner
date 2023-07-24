package designpatterns.singleton.doublechecklocking;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if (instance == null) { //first check
            synchronized (DataBaseConnection.class) {
                if (instance == null) { // 2nd check.
                    instance = new DataBaseConnection(); //Critical Section.
                }
            }
        }
        return instance;
    }
}

//this implementation will work in Multithreaded environment.
//Performance is not good.
