package FactoryMethod;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try {
            String dbType = "postgresql";
            DBConnection adapter = DBFactory.getDBAdapter(dbType);
            Connection connection = adapter.getConnection();
            System.out.println(dbType + " Is Open => " + (!connection.isClosed()));
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}