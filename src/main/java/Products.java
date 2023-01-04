import java.sql.SQLException;
import java.util.List;

public interface Products {
    List<Product> all() throws SQLException;
    void insert(Product product);
}
