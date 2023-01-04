import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Config {
    Config() throws SQLException {
    }

    public String getUrl() {
        return "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return "root";
    }
    public String getPassword() {
        return "codeup";
    }
    Config config = new Config();
    Connection connection = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword()
    );
// ...
}
    // ...
