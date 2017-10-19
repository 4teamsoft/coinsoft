package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;

public class AdminsEntity extends BaseEntity {
    public AdminsEntity() {
        super();
        setTableName("admins");
    }

    public AdminsEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

}
