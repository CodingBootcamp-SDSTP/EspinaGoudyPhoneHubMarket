public class Users
{
	private int userID;
	private String username;
	private String password;
	private String email;
	private String contact;
	private String location;
	private String dateRegistered;

	public Users(int userID, String username, String password, String email,
			String contact, String location, String dateRegistered) {
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.location = location;
		this.dateRegistered = dateRegistered;
	}

	public Users(String username, String password, String email, String contact, String location) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.location = location;
	}

	public int getUserID() {
		return(userID);
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return(username);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return(contact);
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return(location);
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDateRegistered() {
		return(dateRegistered);
	}

	public void setDateRegistered(String dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
}
