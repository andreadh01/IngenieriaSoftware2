package FactoryMethod;

import java.sql.Connection;

public abstract class DBConnection {
    public abstract Connection getConnection();
}
