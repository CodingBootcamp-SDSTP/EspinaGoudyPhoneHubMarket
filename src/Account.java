public class Account
{
	private int userID;
	private String username;
	private String password;
	private String email;
	private String contact;
	private String location;
	private String date_registered;
	private int usertype;

	public Account(int userID, String username, String password, String email, String contact, String location, String date_registered, int usertype) {
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.location = location;
		this.date_registered = date_registered;
		this.usertype = usertype;
	}

	public void setUserId(int userID) {
		this.userID = userID;
	}

	public int getUserId() {
		return(userID);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return(username);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return(password);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return(email);
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return(contact);
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return(location);
	}

	public void setDateRegistered(String date_registered) {
		this.date_registered = date_registered;
	}

	public String getDateRegistered() {
		return(date_registered);
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public int getUserType() {
		return(usertype);
	}
}
