package hoshom;
import java.sql.Connection;
    import java.sql.*;

    public class DbConnection {
        private static DbConnection dbconnection;
       private static final String JDBC_URL = "jdbc:mysql://:3306/hoshome";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "";

         Connection connection;

        public DbConnection() {
            try {
                
                connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
                System.out.println("Connected to the database.");
            } catch (SQLException e) {
                System.err.println("Failed to connect to the database. Please check the URL, username, and password and try again.");
                e.printStackTrace();
            }
        }
        
         public static DbConnection getInstance() throws ClassNotFoundException, SQLException
    {
        return dbconnection==null? (dbconnection = new DbConnection()):dbconnection;  
    }

        public Connection getConnection() {
            return connection;
        }

        public void closeConnection() {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Disconnected from the database.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }