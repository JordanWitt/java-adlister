import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "/pickColor", urlPatterns = "/pickColor")
public class ColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Color = request.getParameter("Color");
        response.setContentType("text/html");
        request.getSession().setAttribute("Color", Color);
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }
}

