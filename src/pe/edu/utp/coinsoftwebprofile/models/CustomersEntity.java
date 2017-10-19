package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;

public class CustomersEntity extends BaseEntity {

    public CustomersEntity() {
        super();
        setTableName("customers");
    }

    public CustomersEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }
}
