import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddNewUserServlet extends HttpServlet
{
	PhoneHubDatabase phd;

	public void init() throws ServletException {
		phd = PhoneHubDatabase.instance();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/x-www-form-urlencoded");
		PrintWriter out = res.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		String location = req.getParameter("location");
		System.out.println(username + password + email + contact + location);
		Users user = new Users(username, password, email, contact, location);
		if(phd.insertNewUser(user)) {
			out.println("Success: New user has been added");
			System.out.println("Succes");
		}
		else {
			out.println("Error: Failed to add user");
			System.out.println("Failed");
		}
		out.close();
	}

	public void destroy() {
		phd = null;
	}
}
