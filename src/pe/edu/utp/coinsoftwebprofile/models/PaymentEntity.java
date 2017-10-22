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


    public Payment findById(String id, PaymentEntity paymentEntity) {
        return findByCriteria(
                String.format("WHERE idcustomer = '%d'", id), paymentEntity).get(0);
    }

    public boolean  RegisterPayment(Payment payment)
    {
        return executeUpdate(
                String.format(
                        "INSERT INTO Loans('idpayment','code_payment', 'date_payment','amount','status')" +
                                " VALUES (%d,%d,'%s',%d,%s)"
                        ,getTableName(),payment.getIdpayment(),payment.getCode_payment(),payment.getDate_payment(),payment.getAmount(),payment.getStatus()));

    }







    public List<Payment> findByCriteria(String criteria, PaymentEntity paymentEntity){
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
