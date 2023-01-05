import java.sql.*;

public class MySQLAdsDaoTest {
    public static void main(String[] args) {
        Connection connection;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                System.out.println("title: " + rs.getString(2) + " | description: " + rs.getString(3) + " | price: $" + rs.getBigDecimal(4));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}