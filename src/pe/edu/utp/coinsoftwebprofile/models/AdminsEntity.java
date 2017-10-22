package pe.coinsoft.CsWebProfile.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminEntity extends BaseEntity{

    public AdminEntity(){
        super();
        setTableName("Admin");
    }

    public AdminEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public pe.coinsoft.CsWebProfile.models.Admin login(String dni, String password){
        return findByCriteria(String.format("WHERE dni= %s AND password= %s",dni,password)).get(0);

    }

    public List<pe.coinsoft.CsWebProfile.models.Admin> findByCriteria(String criteria){
        try{
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(getBaseStatement()
                            .concat(criteria));
            List<pe.coinsoft.CsWebProfile.models.Admin> admins = new ArrayList<>();
            while(rs.next()){
                admins.add(pe.coinsoft.CsWebProfile.models.Admin.from(rs));
            }
            return admins;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}