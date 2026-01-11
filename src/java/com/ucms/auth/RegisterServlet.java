import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        String studentId = request.getParameter("student_id");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        response.getWriter().println("Registered: " + name);
    }
}