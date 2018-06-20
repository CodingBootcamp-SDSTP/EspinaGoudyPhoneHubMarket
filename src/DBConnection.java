import java.sql.*;

public class DBConnection
{
	static Connection conn = null;

	private DBConnection() {
	}

	public static Connection getConnection() {
		try {
			if(conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/marketplace?user=testuser&password=helloworld&allowPublicKeyRetrieval=true&useSSL=false");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return(conn);
	}
}
