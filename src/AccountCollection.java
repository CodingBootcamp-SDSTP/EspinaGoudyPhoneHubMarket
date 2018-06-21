import java.util.ArrayList;

public class AccountCollection
{
	ArrayList<Account> accounts;

	public AccountCollection() {
		accounts = new ArrayList<Account>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	public ArrayList<Account> getAllAccounts() {
		return(accounts);
	}

	public Account getAccountByIndex(int n ) {
		return(accounts.get(n));
	}

	public int getAccountCount() {
		return(accounts.size());
	}

	public ArrayList<Account> search(String s) {
		Account account = null;
		ArrayList<Account> accnt = new ArrayList<Account>();
		String str = s.toLowerCase();
		for(int i = 0; i < getAccountCount(); i++) {
			account = getAccountByIndex(i);
			if(matches(account, str)) {
				accnt.add(account);
			}
		}
		return(accnt);
	}

	public boolean matches(Account accnt, String str) {
		String username = accnt.getUsername().toLowerCase();
		String email = accnt.getEmail().toLowerCase();
		String contact = accnt.getContact().toLowerCase();
		String location = accnt.getLocation().toLowerCase();
		if(username.contains(str) || email.contains(str) || contact.contains(str) || location.contains(str)) {
			return(true);
		}
		return(false);
	}
}
