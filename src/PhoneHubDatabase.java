import java.util.ArrayList;
import java.sql.*;

public class PhoneHubDatabase
{
	private PhoneCollection phonecollection;
	private UsersCollection userscollection;
	private PostItemCollection postitemcollection;
	private CommentItemCollection commentcollection;
	private MessageCollection messagecollection;
	private FeedbackCollection feedbackcollection;
	private Connection conn;
	private static PhoneHubDatabase _instance = null;

	public static PhoneHubDatabase instance() {
		if(_instance == null) {
			_instance = new PhoneHubDatabase();
		}
		return(_instance);
	}

	private PhoneHubDatabase() {
		phonecollection = new PhoneCollection();
		userscollection = new UsersCollection();
		postitemcollection = new PostItemCollection();
		commentcollection = new CommentItemCollection();
		messagecollection = new MessageCollection();
		feedbackcollection = new FeedbackCollection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/phonehubmarket?user=testuser&password=helloworld&serverTimezone=UTC&useSSL=false");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public PhoneCollection getPhoneCollection() {
		return(phonecollection);
	}

	public UsersCollection getUserCollection() {
		return(userscollection);
	}

	public PostItemCollection getPostItemCollection() {
		return(postitemcollection);
	}

	public CommentItemCollection getCommentItemCollection() {
		return(commentcollection);
	}

	public MessageCollection getMessageCollection() {
		return(messagecollection);
	}

	public FeedbackCollection getFeedbackCollection() {
		return(feedbackcollection);
	}

	public void addUser(Users user) {
		if(insertNewUser(user)) {
			userscollection.addUsers(user);
		}
	}

	public boolean insertNewUser(Users user) {
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("INSERT INTO users ( username, password, email, contact, location, date_registered) VALUES ( ?, ?, ?, ?, ?, ? )");
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getContact());
			stmt.setString(5, user.getLocation());
			stmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			return(false);
		}
		finally {
			try { if(stmt != null) stmt.close(); } catch (Exception e) {};
		}
		return(true);
	}

	public boolean checkLoginCredentials(String username, String password) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			while(rs.next()) {
				if(username.equalsIgnoreCase(rs.getString("username")) && 
						password.equalsIgnoreCase(rs.getString("password"))) {
					return(true);
				}
				else {
					return(false);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return(false);
		}
		finally {
			try { if(stmt != null) stmt.close(); } catch (Exception e) {};
			try { if(rs != null) rs.close(); } catch (Exception e) {};
		}
		return(true);
	}
}
