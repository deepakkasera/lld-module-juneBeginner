package designpatterns.singleton.earlyloading;

import designpatterns.singleton.singlethreaded.DataBaseConnection;

public class Client {
    public static void main(String[] args) {
        designpatterns.singleton.singlethreaded.DataBaseConnection dbc1 =  designpatterns.singleton.singlethreaded.DataBaseConnection.getInstance();
        System.out.println(dbc1);

        designpatterns.singleton.singlethreaded.DataBaseConnection dbc2 = DataBaseConnection.getInstance();
        System.out.println(dbc2);

        //Asignment :-
        //Create 2 threads, and try to create the object of
        //DBC from those 2 threads.
    }
}
