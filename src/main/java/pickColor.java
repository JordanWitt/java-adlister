import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "/pickColor", urlPatterns = "/pickcolor")
public class pickColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        String Color = request.getParameter("color");
        PrintWriter pw = response.getWriter();
        pw.println("<p>Color::" + Color + "</p>");
        pw.println("<html>");
        pw.println("<body bgcolor='" + Color + "'>");
        pw.println("<marquee><h1>HAVE A GREAT TIME AHEAD</h1></marquee>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}

