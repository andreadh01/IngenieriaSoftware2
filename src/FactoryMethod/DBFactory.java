package FactoryMethod;

public class DBFactory {
    public static DBConnection getDBAdapter(String dbType){
        switch(dbType){
            case "mysql":
                return new MySQLAdapter();
            case "postgresql":
                return new PostgreSQLAdapter();
            default:
                throw new RuntimeException("Unsupported db type");
        }
    }
}