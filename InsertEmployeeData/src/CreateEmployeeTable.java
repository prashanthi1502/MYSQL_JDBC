import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee"; // Replace with your actual database name
        String user = "root"; // Replace with your database username
        String password = "3308"; // Replace with your database password

        String createTableSQL = "CREATE TABLE employee (" +
                "empcode INT PRIMARY KEY, " +
                "empname VARCHAR(50) NOT NULL, " +
                "empage INT NOT NULL, " +
                "esalary DECIMAL(10, 2) NOT NULL" +
                ");";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'employee' created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
