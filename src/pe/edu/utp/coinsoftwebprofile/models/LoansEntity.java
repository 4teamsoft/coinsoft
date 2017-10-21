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

    //  public Loans  ConsultarPago(int idloan, int idCostumers) {

    // return findByCriteria(String.format("WHERE idloan= %p OR idCostumers=%p"),idloan,idCostumers).get(0);

    // }

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