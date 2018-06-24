import java.util.ArrayList;

public class UsersCollection 
{
	ArrayList<Users> users;

	public UsersCollection() {
		users = new ArrayList<Users>();
	}

	public void addUsers(Users user) {
		users.add(user);
	}

	public void removeUsers(Users user) {
		users.remove(user);
	}

	public ArrayList<Users> getAllUserss() {
		return(users);
	}

	public Users getUsersByIndex(int n ) {
		return(users.get(n));
	}

	public int getUsersCount() {
		return(users.size());
	}

	public ArrayList<Users> search(String s) {
		Users user = null;
		ArrayList<Users> us = new ArrayList<Users>();
		String str = s.toLowerCase();
		for(int i = 0; i < getUsersCount(); i++) {
			user = getUsersByIndex(i);
			if(matches(user, str)) {
				us.add(user);
			}
		}
		return(us);
	}

	public boolean matches(Users user, String str) {
		String username = user.getUsername().toLowerCase();
		String email = user.getEmail().toLowerCase();
		String contact = user.getContact().toLowerCase();
		String location = user.getLocation().toLowerCase();
		if(username.contains(str) || email.contains(str) || contact.contains(str) || location.contains(str)) {
			return(true);
		}
		return(false);
	}
}
