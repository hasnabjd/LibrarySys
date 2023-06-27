public abstract class User {

    private String username;
    private String password;

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

    // Login method to check if the provided credentials match the user's username and password
    public boolean login(String username, String password) {
        return getUsername().equals(username) && getPassword().equals(password);
    }

    public void logout() {
        System.out.println("Log out succeded");
    }
}
