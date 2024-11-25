import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Snippet {
	private Connection connection;
	    private void connectToDatabase() {
	    	
	        String url="jdbc:mysql://localhost:3306/my_db?useUnicode=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&autoReconnect=true&useSSL=false&allowMultiQueries=true&useAffectedRows=true";
	        String user = "root";
	        String password = "asd123";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(url,user,password);
	            System.out.println("Connected to the database successfully.");
	        } catch (ClassNotFoundException | SQLException e) {
	            System.err.println("Error connecting to the database.");
	            e.printStackTrace();
	            System.err.println("Error connecting to the database."); 
	        }
	    }
}