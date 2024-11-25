

public class Snippet {
	private Connection connection;
	    private void connectToDatabase() {
	        // 数据库URL，用户名和密码
	
	        String url="jdbc:mysql://localhost:3306/my_db?useUnicode=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&autoReconnect=true&useSSL=false&allowMultiQueries=true&useAffectedRows=true";
	        String user = "root";
	        String password = "asd123";
	        try {
	            // 加载数据库驱动
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            // 建立数据库连接
	            connection = DriverManager.getConnection(url,user,password);
	            System.out.println("Connected to the database successfully.");
	        } catch (ClassNotFoundException | SQLException e) {
	            System.err.println("Error connecting to the database.");
	            e.printStackTrace();
	        }
	    }
}