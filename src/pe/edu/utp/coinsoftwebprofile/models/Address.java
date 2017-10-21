package pe.edu.utp.coinsoftwebprofile.models;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Address {
    private int idcustomer;
    private String department;
    private String province;
    private String district;
    private String via;
    private String name_via;
    private String number_door;
    private String number_department;
    private String block;
    private String allotment;
    private String reference;
    private String status;

    public Address() {
    }

    public Address(int idcustomer, String department, String province, String district, String via, String name_via,
                   String number_door, String number_department, String block, String allotment, String reference, String status) {
        this.idcustomer = idcustomer;
        this.department = department;
        this.province = province;
        this.district = district;
        this.via = via;
        this.name_via = name_via;
        this.number_door = number_door;
        this.number_department = number_department;
        this.block = block;
        this.allotment = allotment;
        this.reference = reference;
        this.status = status;
    }

    public int getIdcustomer() {
        return idcustomer;

    }

    public Address setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Address setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public Address setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getVia() {
        return via;
    }

    public Address setVia(String via) {
        this.via = via;
        return this;
    }

    public String getName_via() {
        return name_via;
    }

    public Address setName_via(String name_via) {
        this.name_via = name_via;
        return this;
    }

    public String getNumber_door() {
        return number_door;
    }

    public Address setNumber_door(String number_door) {
        this.number_door = number_door;
        return this;
    }

    public String getNumber_department() {
        return number_department;
    }

    public Address setNumber_department(String number_department) {
        this.number_department = number_department;
        return this;
    }

    public String getBlock() {
        return block;
    }

    public Address setBlock(String block) {
        this.block = block;
        return this;
    }

    public String getAllotment() {
        return allotment;
    }

    public Address setAllotment(String allotment) {
        this.allotment = allotment;
        return this;
    }

    public String getReference() {
        return reference;
    }

    public Address setReference(String reference) {
        this.reference = reference;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Address setStatus(String status) {
        this.status = status;
        return this;
    }

    public static Address from(ResultSet rs) {
        try {
            return new Address(
                    rs.getInt("idcustomer"),
                    rs.getString("department"),
                    rs.getString("province"),
                    rs.getString("district"),
                    rs.getString("via"),
                    rs.getString("name_via"),
                    rs.getString("number_door"),
                    rs.getString("number_department"),
                    rs.getString("block"),
                    rs.getString("allotment"),
                    rs.getString("reference"),
                    rs.getString("status")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }


}