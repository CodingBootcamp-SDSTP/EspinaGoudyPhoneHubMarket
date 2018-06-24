import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginUserServlet extends HttpServlet
{
	PhoneHubDatabase phd;

	public void init() throws ServletException {
		phd = PhoneHubDatabase.instance();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/x-www-form-urlencoded");
		PrintWriter out = res.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(phd.checkLoginCredentials(username, password)) {
			out.println("Success: Logged In");
		}
		else {
			out.println("Error: Incorrect username or password");
		}
		out.close();
	}

	public void destroy() {
		phd = null;
	}
}
