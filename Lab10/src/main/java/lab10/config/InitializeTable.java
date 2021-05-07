package lab10.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitializeTable {

    public static void setUpDb() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS student (id int PRIMARY KEY AUTO_INCREMENT, " +
                "first_name varchar(15), last_name varchar(15))";
        Connection dataBaseConnection = SqlConfig.getDataBaseConnection();
        try {
            Statement statement = dataBaseConnection.createStatement(); // Statement
            statement.execute(createTableSql);
            System.out.println("Successfully created table");
        } catch (SQLException exception) {
            System.err.println("Could not create table");
        }
    }

    private InitializeTable() {
    }
}
