import java.sql.*;

public class PhoneHubDatabase
{
	private AccountCollection accounts;
	private ItemCollection itemcollections;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private StringBuilder sb = new StringBuilder();

	public PhoneHubDatabase() {
		accounts = new AccountCollection();
		itemcollections = new ItemCollection();
		conn = DBConnection.getConnection();
	}

	public String getAllUsersInfo() {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			while(rs.next()) {
				sb.append("<username>" + rs.getString("username") + "</username>");
				sb.append("<email>" + rs.getString("email") + "</email>");
				sb.append("<contact>" + rs.getString("contact") + "</contact>");
				sb.append("<location>" + rs.getString("location") + "</location>");
				sb.append("<date_registered>" + rs.getString("date_registered") + "</date_registered>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt != null) {stmt = null;}} catch(Exception e){};
			try { if(rs != null) {rs = null;}} catch(Exception e){};
		}
		return(sb.toString());
	}

	public String getAllPostedItems() {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM posted_items");
			while(rs.next()) {
				sb.append("<section>" + rs.getString("section_type") + "</section>");
				sb.append("<category_id>" + rs.getInt("category_id") + "</category_id>");
				sb.append("<price>" + rs.getPrice("price") + "</price>");
				sb.append("<item_condition>" + rs.getString("item_condition") + "</item_condition>");
				sb.append("<description>" + rs.getString("description") + "</description>");
				sb.append("<image>" + rs.getString("imagedata") + "</image>");
				sb.append("<date_posted>" + rs.getString("date_posted") + "</date_posted>");
				sb.append("<user_id>" + rs.getInt("user_id") + "</user_id>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt != null) {stmt = null;}} catch(Exception e){};
			try { if(rs != null) {rs = null;}} catch(Exception e){};
		}
		return(sb.toString());
}