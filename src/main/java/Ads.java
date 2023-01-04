import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> getAllAds() throws SQLException;

    Ad getAdById(int id) throws SQLException;

    void createAd(Ad ad) throws SQLException;

    void updateAd(Ad ad) throws SQLException;

    void deleteAd(int id) throws SQLException;

    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
