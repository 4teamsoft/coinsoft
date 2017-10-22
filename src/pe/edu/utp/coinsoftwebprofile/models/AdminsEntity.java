package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminsEntity extends BaseEntity{

    public AdminsEntity(){
        super();
        setTableName("Admin");
    }

    public AdminsEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public login(String dni, String password){
        return findByCriteria(String.format("WHERE dni= %s AND password= %s",dni,password)).get(0);

    }

    public List<Admin> findByCriteria(String criteria){
        try{
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(getBaseStatement()
                            .concat(criteria));
            List<Admin> admins = new ArrayList<>();
            while(rs.next()){
                admins.add(Admin.from(rs));
            }
            return admins;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}