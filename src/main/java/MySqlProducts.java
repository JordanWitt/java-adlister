import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLProducts implements Products{

    private Connection connectionObj;

    public MySQLProducts() throws SQLException {
    }

    public MySQLProducts(Config configObject) throws SQLException, SQLException {
        DriverManager.registerDriver(new Driver());
        this.connectionObj = DriverManager.getConnection(
                configObject.getUrl(),
                configObject.getUser(),
                configObject.getPassword()
        );
    }
    @Override
    public List<Product> all() throws SQLException {

        Statement statementObj = connectionObj.createStatement();

        ResultSet resultSetObj = statementObj.executeQuery("SELECT * from products");

        List<Product> myProducts = new ArrayList();

        while(resultSetObj.next()){
            myProducts.add(
                    new Product(resultSetObj.getString("name"), resultSetObj.getDouble("price")

                    )
            );

        }
        return myProducts;
    }
    @Override
    public void insert(Product product) {

    }

}
