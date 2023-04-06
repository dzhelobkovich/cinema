package model;

public class Person {
    private Long id;
    private String username;
    private String password;
    private String role;

    public Person(){

    }
    public Person(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public Person(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person id:  " + id + " | " +
                "username: " + username + " | " +
                "password: " + password +
                "role: " + role + " | ";

    }
}