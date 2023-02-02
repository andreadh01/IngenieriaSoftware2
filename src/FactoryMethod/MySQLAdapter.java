package FactoryMethod;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLAdapter extends DBConnection {

    static {
        try {
            new com.mysql.cj.jdbc.Driver();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error on load MySQL Driver");
        }
    }

    @Override
    public Connection getConnection() {
        try {
            String user = "root";
            String password = "";
            String host = "localhost";
            String port = "3306";
            String db = "finkies";

            String url = "jdbc:mysql://${host}:${port}/${db}"
                    .replace("${host}", host).replace("${port}", port).replace("${db}", db);

            Connection connection = DriverManager.getConnection(url, user, password); //connection to MySQL
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("MySQL connection error " + e.getMessage());
        }
    }
}
