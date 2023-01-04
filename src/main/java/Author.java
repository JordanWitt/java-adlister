import java.io.Serializable;

public class Author implements Serializable {
    protected String firstName;
    protected String location;

    public Author(){}

    public Author(String firstName, String location) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
