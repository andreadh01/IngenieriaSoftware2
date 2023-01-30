package FactoryMethod;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLAdapter extends DBConnection {
    static {
        try {
            new org.postgresql.Driver();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error on load MySQL Driver");
        }
    }

    @Override
    public Connection getConnection() {
        try {
            String user = "andreadh";
            String password = "";
            String host = "localhost";
            String port = "5000";
            String db = "pizzadb";

            String url = "jdbc:postgresql://${host}:${port}/${db}"
                    .replace("${host}", host).replace("${port}", port).replace("${db}", db);

            Connection connection = DriverManager.getConnection(url, user, password); //connection to MySQL
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("PostgreSQL connection error " + e.getMessage());
        }
    }
}
