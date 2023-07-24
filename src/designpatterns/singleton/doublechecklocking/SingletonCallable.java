package designpatterns.singleton.doublechecklocking;

import java.util.concurrent.Callable;

public class SingletonCallable implements Callable<DataBaseConnection> {
    @Override
    public DataBaseConnection call() {
        DataBaseConnection dataBaseConnection = DataBaseConnection.getInstance();
        return dataBaseConnection;
    }
}
