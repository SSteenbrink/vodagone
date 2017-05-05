package han.ica.oose.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Gebruiker on 18-10-2016.
 */
public class JDBCConnectionFactory {

    private static JDBCConnectionFactory instance = new JDBCConnectionFactory();
    public static final String DBMS = "mysql";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "vodagone";


    public static final String USER = "root";
    public static final String PASSWORD = "Yecgaa1!";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    //private constructor
    private JDBCConnectionFactory() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection() {
        Connection connection = null;
        try {
            String URL = "jdbc:"+ DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE;
            System.out.println(URL);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connection established!");
        } catch (SQLException e) {
            System.out.print(e.getErrorCode() + " | "+ e.getMessage());
            System.out.println();
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection() {
        return instance.createConnection();
    }
}
