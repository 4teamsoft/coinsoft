package pe.edu.utp.coinsoftwebprofile.models;

public class User {

    private String type;
    private String dni;
    private String password;
    private String name;
    private String last_name;
    private String email;
    private String status;

    public User(String type, String dni, String password, String name, String last_name, String email, String status) {
        this.type = type;
        this.dni = dni;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.status = status;
    }

    public User() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
