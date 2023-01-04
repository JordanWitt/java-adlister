import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="FailureServlet", urlPatterns="/failure")
public class FailureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>You've Lost</h1>");
        out.println("<h2>Better luck next time!</h2>");
        out.println("<p>Unfortunately, you didn't win this time. But don't give up!</p>");
        out.println("<p>Here's a consolation prize:</p>");
        out.println("<p><img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIYIO3UQALDvNIJmTjKGjxkrQVAnbOWCzA4Q&usqp=CAU' alt='consolation image'></p>");
    }
}