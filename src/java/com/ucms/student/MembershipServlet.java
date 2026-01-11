import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/student/MembershipServlet")
public class MembershipServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String clubId = request.getParameter("club_id");
        response.getWriter().println("Membership submitted");
    }
}