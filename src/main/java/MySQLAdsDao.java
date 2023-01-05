import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads {
    private List<Ad> ads = new ArrayList<>();
    private Connection connection = null;

    public MySQLAdsDao(Config c) throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    c.getUrl(),
                    c.getUsername(),
                    c.getPassword()
            );
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> getAllAds() throws SQLException {
        return null;
    }

    @Override
    public Ad getAdById(int id) throws SQLException {
        return null;
    }

    @Override
    public void createAd(Ad ad) throws SQLException {

    }

    @Override
    public void updateAd(Ad ad) throws SQLException {

    }

    @Override
    public void deleteAd(int id) throws SQLException {

    }

    /**
     * Updates ads member with current db items
     * returns ads*/
    public List<Ad> all() {
        try{
            ads.clear();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                // create new ad
                // insert into ads
                Ad a = new Ad(rs.getLong(1), rs.getLong(2), rs.getString(3), rs.getString(4) );
                ads.add(a);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return ads;
    }


    public Long insert(Ad ad) {
        int rowsAffected = -1;
        try{
            String sql = "INSERT INTO ads( title, description, user_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Set the values for the placeholders in the prepared statement

            stmt.setString(1, ad.getTitle());
            stmt.setString(2, ad.getDescription());
            stmt.setInt(3, (int) ad.getUserId());

            rowsAffected = stmt.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        // update local list of ads after update
        all();
        return (long) rowsAffected;
    }

}
