package pe.edu.utp.coinsoftwebprofile.models;

import java.sql.Connection;

public class ManagersEntity extends BaseEntity {

    public ManagersEntity() {
        super();
        setTableName("managers");
    }

    public ManagersEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }
}
