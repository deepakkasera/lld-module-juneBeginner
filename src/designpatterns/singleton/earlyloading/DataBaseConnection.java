package designpatterns.singleton.earlyloading;

public class DataBaseConnection {

    //Early loading or Early Initialisation.
    private static DataBaseConnection instance = new DataBaseConnection();
    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
//        if (instance == null) {
//            instance = new DataBaseConnection();
//        }
        return instance;
    }
}
