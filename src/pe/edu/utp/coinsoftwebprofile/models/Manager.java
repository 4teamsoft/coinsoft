package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager extends User {

    private int time_work;
    private int idadmin;

    public Manager (){
        super();
    }

    public Manager(String type, String dni, String password, String name, String last_name, String email, String status, int time_work, int idadmin) {
        super(type, dni, password, name, last_name, email, status);
        this.time_work = time_work;
        this.idadmin = idadmin;
    }

    public int getTime_work() {
        return time_work;
    }

    public void setTime_work(int time_work) {
        this.time_work = time_work;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public static Manager from (ResultSet rs){

        try{
            return new Manager(
                    rs.getString("type"),
                    rs.getString("dni"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getString("status"),
                    rs.getInt("time_work"),
                    rs.getInt("idadmin"));

        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }


}