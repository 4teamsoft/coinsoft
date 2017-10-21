package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Payment {
    int idpayment;
    int code_payment;
    String date_payment;
    int amount;
    String status;

    public Payment(int idpayment, int code_payment, String date_payment, int amount, String status) {
        this.idpayment = idpayment;
        this.code_payment = code_payment;
        this.date_payment = date_payment;
        this.amount = amount;
        this.status = status;
    }

    public int getIdpayment() {
        return idpayment;
    }

    public Payment setIdpayment(int idpayment) {
        this.idpayment = idpayment;
        return this;
    }

    public int getCode_payment() {
        return code_payment;
    }

    public Payment setCode_payment(int code_payment) {
        this.code_payment = code_payment;
        return this;
    }

    public String getDate_payment() {
        return date_payment;
    }

    public Payment setDate_payment(String date_payment) {
        this.date_payment = date_payment;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Payment setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Payment setStatus(String status) {
        this.status = status;
        return this;
    }

    public static Payment from(ResultSet rs) {
        try {
            return new Payment(
                    rs.getInt("idpayment"),
                    rs.getInt("code_payment"),
                    rs.getString("date_payment"),
                    rs.getInt("amount"),
                    rs.getString("status"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}