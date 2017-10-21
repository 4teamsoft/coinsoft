package pe.edu.utp.coinsoftwebprofile.models;

public class Managers_customers {


    private int idmanager;
    private int idcustomer;


    public Managers_customers(int idmanager, int idcustomer) {
        this.idmanager = idmanager;
        this.idcustomer = idcustomer;
    }

    public Managers_customers() {

    }


    public int getIdmanager() {
        return idmanager;
    }

    public Managers_customers setIdmanager(int idmanager) {
        this.idmanager = idmanager;
        return this;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public Managers_customers setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
        return this;
    }




}
