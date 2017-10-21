package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Loan {


    int idloan;
    int code_loan;
    String date_start;
    double amount;
    int number_quota;
    int day;
    String type;
    int idCostumers;
    String status;

    public Loan(int idloan, int code_loan, String date_start, double amount, int number_quota, int day, String type, int idCostumers, String status) {
        this.idloan = idloan;
        this.code_loan = code_loan;
        this.date_start = date_start;
        this.amount = amount;
        this.number_quota = number_quota;
        this.day = day;
        this.type = type;
        this.idCostumers = idCostumers;
        this.status = status;
    }

    public int getIdloan() {
        return idloan;
    }

    public Loan setIdloan(int idloan) {
        this.idloan = idloan;
        return this;
    }

    public int getCode_loan() {
        return code_loan;
    }

    public Loan setCode_loan(int code_loan) {
        this.code_loan = code_loan;
        return this;
    }

    public String getDate_start() {
        return date_start;
    }

    public Loan setDate_start(String date_start) {
        this.date_start = date_start;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Loan setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public int getNumber_quota() {
        return number_quota;
    }

    public Loan setNumber_quota(int number_quota) {
        this.number_quota = number_quota;
        return this;
    }

    public int getDay() {
        return day;
    }

    public Loan setDay(int day) {
        this.day = day;
        return this;
    }

    public String getType() {
        return type;
    }

    public Loan setType(String type) {
        this.type = type;
        return this;
    }

    public int getIdCostumers() {
        return idCostumers;
    }

    public Loan setIdCostumers(int idCostumers) {
        this.idCostumers = idCostumers;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Loan setStatus(String status) {
        this.status = status;

        return this;
    }


    public static Loan from(ResultSet rs) {
        try {
            return new Loan(
                    rs.getInt("idloan"),
                    rs.getInt("code_loan"),
                    rs.getString("date_start"),
                    rs.getDouble("amount"),
                    rs.getInt("number_quota"),
                    rs.getInt("day"),
                    rs.getString("type"),
                    rs.getInt("idCostumers"),
                    rs.getString("status"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}

