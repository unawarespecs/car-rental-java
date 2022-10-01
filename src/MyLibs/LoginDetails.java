package MyLibs;

public class LoginDetails {
    private String username;
    private String password;
    
    public LoginDetails(String user, String pass) {
        this.username = user;
        this.password = pass;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
