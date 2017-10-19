package pe.edu.utp.coinsoftwebprofile.models;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
    private int idadministrator;
    private int dni;
    private String password;
    private String name;
    private String last_name;
    private String mail;
    private String status;


    public Admin(int idadministrator, int dni, String password, String name, String last_name, String mail, String status) {
        this.idadministrator = idadministrator;
        this.dni = dni;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.mail = mail;
        this.status = status;
    }

    public Admin(){

    }

    public int getIdadministrator() {
        return idadministrator;
    }

    public Admin setIdadministrator(int idadministrator) {
        this.idadministrator = idadministrator;
        return this;
    }

    public int getDni() {
        return dni;
    }

    public Admin setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Admin setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Admin setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Admin setStatus(String status) {
        this.status = status;
        return this;
    }


    public static Admin from(ResultSet rs) {
        try {
            return new Admin(
                    rs.getInt("idadministrator"),
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
