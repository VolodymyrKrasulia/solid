package com.homeworks.solid.ocp.good;

public class DBConnectorService {

    private DBConnector dbConnector;

    public DBConnectorService(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public void connectToDB() {
        dbConnector.connect();
    }

}
