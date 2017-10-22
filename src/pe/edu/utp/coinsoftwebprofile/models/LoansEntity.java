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




    public Loan findById(int id, LoansEntity loansEntity) {
        return findByCriteria(
                String.format("WHERE idloan = '%d'", id),loansEntity).get(0);
    }



    public List<Loan> findByCriteria(String criteria, LoansEntity loansEntity) {
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