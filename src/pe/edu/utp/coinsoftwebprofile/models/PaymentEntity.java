package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentEntity extends BaseEntity {

    public PaymentEntity(){
        super();
        setTableName("Payment");
    }


    public PaymentEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }






    public List<Payment> findByCriteria(String criteria){
        try{
            ResultSet rs = getConnection().createStatement().executeQuery(getBaseStatement().concat(criteria));
            List<Payment> payment = new ArrayList<>();
            while(rs.next()){
                payment.add(Payment.from(rs));
            }
            return payment;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
