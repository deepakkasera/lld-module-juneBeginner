package designpatterns.singleton.singlethreaded;

public class Client {
    public static void main(String[] args) {
        DataBaseConnection dbc1 =  DataBaseConnection.getInstance();
        System.out.println(dbc1);

        DataBaseConnection dbc2 = DataBaseConnection.getInstance();
        System.out.println(dbc2);

        //Asignment :-
        //Create 2 threads, and try to create the object of
        //DBC from those 2 threads.
    }
}
