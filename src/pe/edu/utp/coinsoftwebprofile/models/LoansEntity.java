package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoansEntity extends BaseEntity {

    public LoansEntity(){
        super();
        setTableName("Loans");
    }

    public LoansEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }


    public Loan RegisterPayment(int idloan, int	code_loan, String date_start,double	amount,int number_quota,int	day,String type,int	idCostumers,String	status)
    {
        return findByCriteria(String.format("INSERT INTO Loans('idloan','code_loan','date_start','amount','number_quota','day','type','idCostumers','status') VALUES (%d,%d,%s,%d,%d,%d,%s,%d,%s)",idloan,code_loan,date_start,amount,number_quota,day,type,idCostumers,status)).get(0);

    }

    public List<Loan> findByCriteria(String criteria) {
        try {

            ResultSet rs = getConnection().createStatement().executeQuery(getBaseStatement().concat(criteria));
            List<Loan>  loans = new ArrayList<>();
            while(rs.next()){
                loans.add(Loan.from(rs));
            }
            return loans;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}