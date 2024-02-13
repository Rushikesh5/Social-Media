import java.sql.Connection;
import java.sql.DriverManager;

public class SQLtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/social_db","root","root");
			java.sql.PreparedStatement st = conn.prepareStatement("select * from user");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
