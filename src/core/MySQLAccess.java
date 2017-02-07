import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess {
    private static MySQLAccess INSTANCE = new MySQLAccess();
    private Connection connect = null;

    private MySQLAccess() {
        try {
            connectDataBase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MySQLAccess getInstance() {
        return INSTANCE;
    }

    private void connectDataBase() throws Exception {
        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");
        // Setup the connection with the DB
        connect = DriverManager
                .getConnection("jdbc:mysql://localhost/jockeyponey?"
                        + "user=root&password=");
    }

    public ResultSet resultQuery(String query) {
        ResultSet resultSet = null;
        Statement statement = null;
        try {

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(query);
            return resultSet;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return resultSet;
    }

    public void updateQuery(String query) {
        int result = 0;
        Statement statement = null;
        try {

            statement = connect.createStatement();
            result = statement
                    .executeUpdate(query);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
