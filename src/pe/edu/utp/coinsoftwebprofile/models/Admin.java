package pe.coinsoft.CsWebProfile.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends User{

    private int idadmin;
    private int idarea;

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public Admin(){
        super();
    }

    public Admin(int idadmin,String type, String dni, String password, String name, String last_name, String email, String status, int idarea) {
        super(type, dni, password, name, last_name, email, status);
        this.idarea = idarea;
        this.idadmin = idadmin;
    }


    public static Admin from(ResultSet rs){

        try{
            return new Admin(
                    rs.getInt("idamin"),
                    rs.getString("type"),
                    rs.getString("dni"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getString("status"),
                    rs.getInt("idarea"));

        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }
}
