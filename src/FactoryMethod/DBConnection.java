package FactoryMethod;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBConnection {
    public abstract Connection getConnection();

    public void insertQuery(Connection conexion, String query) throws SQLException {
        Statement statement = conexion.createStatement();
        statement.execute(query);
        System.out.println("Insert realizado exitosamente");

    }

    public void deleteQuery(Connection conexion, String query) throws SQLException {
        Statement statement = conexion.createStatement();
        statement.execute(query);
        System.out.println("Delete realizado exitosamente");

    }

    public void updateQuery(Connection conexion, String query) throws SQLException {
        Statement statement = conexion.createStatement();
        statement.execute(query);
        System.out.println("Update realizado exitosamente");

    }


}
