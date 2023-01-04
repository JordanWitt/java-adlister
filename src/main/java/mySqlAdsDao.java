import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class mySqlAdsDao {

    public static void main(String[] args) throws SQLException {


        DriverManager.registerDriver(new Driver());

        Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_cohort_example_db ?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup");

        Statement statementObj = connectionObj.createStatement();

        System.out.println(statementObj.executeUpdate("DELETE FROM products where name = '?'"));

        ResultSet resultSetObj = statementObj.executeQuery("SELECT * from products");


        while (resultSetObj.next()) {

            System.out.println("testing");
            System.out.println("Our first product is " + resultSetObj.getString("name")); //grab this column by name and bring it in as this datatype

            System.out.println("The price of that product was:" + resultSetObj.getDouble("price")); //grab this column by name and bring it in as this datatype

            System.out.println("~~~~~~~~~~~");

        }

        String insertQuery = "INSERT INTO products (name, price) VALUES ('?', 399.99)";

        statementObj.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

        ResultSet resultSetObj2 = statementObj.getGeneratedKeys();

        if (resultSetObj2.next()) {

            System.out.println("Inserted a new record! New id: " + resultSetObj2.getLong(1));
        }

    }
}
