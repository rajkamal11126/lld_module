package dev.rajkamal.lld_module.designpatterns.singleton.synchronised;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;
    private DataBaseConnection(){}

    public static synchronized DataBaseConnection getInstance() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }
    //Will work in multithreaded environment.

    //Issues :-
    //Slow performance.
}
