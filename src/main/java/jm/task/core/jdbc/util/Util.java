package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/idea_shema";
    private static final String DB_UserName = "root";
    private static final String DB_Password = "root042896";

    // реализуйте настройку соеденения с БД
    public static Connection getConnection() {
        try {
            Class.forName(DB_Driver);
            Connection connection = DriverManager.getConnection(DB_URL, DB_UserName, DB_Password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
