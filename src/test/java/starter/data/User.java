package starter.data;

public class User {
    private String userInformation;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInformation() {
        return userInformation;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String email = "sau.hills@hotmail.com";
    String password = "w0sqdmgf3m3s2u";
    String fullName;
    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}