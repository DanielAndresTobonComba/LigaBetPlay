package dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {


    private static final String URL = "jdbc:mysql://localhost:3306/LigaBetPlay";

    private static final String USER = "campus2023";

    private static final String PASSWORD = "campus2023";

    public static Connection gConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
