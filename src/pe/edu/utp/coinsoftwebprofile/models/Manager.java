package pe.edu.utp.coinsoftwebprofile.models;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
    private int iduser;
    private int dni;
    private String password;
    private String name;
    private String last_name;
    private String mail;
    private String status;


    public Manager(int iduser, int dni, String password, String name, String last_name, String mail, String status) {
        this.iduser = iduser;
        this.dni = dni;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.mail = mail;
        this.status = status;
    }

    public Manager() {

    }

    public int getIduser() {
        return iduser;
    }

    public Manager setIduser(int iduser) {
        this.iduser = iduser;
        return this;
    }

    public int getDni() {
        return dni;
    }

    public Manager setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Manager setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Manager setName(String name) {
        this.name = name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Manager setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Manager setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Manager setStatus(String status) {
        this.status = status;
        return this;
    }


    public static Manager from(ResultSet rs) {
        try {
            return new Manager(
                    rs.getInt("iduser"),
                    rs.getInt("dni"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("last_name"),
                    rs.getString("mail"),
                    rs.getString("status")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }




}
