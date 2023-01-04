import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/products")
public class ShowProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Products productDao = null;
        try {
            productDao = DaoFactory.getProductsDao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        List<Product> myProducts = null;
        try {
            myProducts = productDao.all();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("productsList", myProducts);

        req.getRequestDispatcher("/products/index.jsp").forward(req, resp);
    }
}