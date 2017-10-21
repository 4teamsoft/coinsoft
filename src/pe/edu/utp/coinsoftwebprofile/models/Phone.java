package pe.edu.utp.coinsoftwebprofile.models;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Phone {
    private int idphone;
    private String number;
    private String type;
    private String operator;
    private String status;

    public Phone() {
    }

    public Phone(int idphone, String number, String type, String operator, String status) {
        this.idphone = idphone;
        this.number = number;
        this.type = type;
        this.operator = operator;
        this.status = status;
    }

    public int getIdphone() {
        return idphone;
    }

    public Phone setIdphone(int idphone) {
        this.idphone = idphone;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Phone setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getType() {
        return type;
    }

    public Phone setType(String type) {
        this.type = type;
        return this;
    }

    public String getOperator() {
        return operator;
    }

    public Phone setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Phone setStatus(String status) {
        this.status = status;
        return this;
    }

    public static Phone from(ResultSet rs) {
        try {
            return new Phone(
                    rs.getInt("idphone"),
                    rs.getString("number"),
                    rs.getString("type"),
                    rs.getString("operator"),
                    rs.getString("status")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
