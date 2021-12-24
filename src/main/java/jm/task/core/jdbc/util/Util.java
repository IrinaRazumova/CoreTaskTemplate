package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static final String user = "dbadmin";
    static final String password = "1234";
    static final String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {

        try{
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
