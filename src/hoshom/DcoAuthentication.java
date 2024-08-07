package hoshom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DcoAuthentication{
    
      private Connection connection;

    public DcoAuthentication(DbConnection dbConnection) {
        this.connection = dbConnection.getConnection();
    }

    public boolean login(String username, String password) {
        String query = "SELECT * FROM Doctor WHERE username = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // Returns true if a matching user is found
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean register(String fName,String lName, int age, String username, String password) {
        String query = "INSERT INTO Doctor (fname,lname, age, username, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, fName);
            statement.setString(2, lName);
            statement.setInt(3, age);
            statement.setString(5, password);
            statement.setString(4, username);
            
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}