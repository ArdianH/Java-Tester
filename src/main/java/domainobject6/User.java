package domainobject6;

/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class User {

    public String username;
    public String password;

    public User() {
        this("username", "password");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
