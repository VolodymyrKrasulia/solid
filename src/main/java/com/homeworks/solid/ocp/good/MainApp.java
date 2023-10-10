package com.homeworks.solid.ocp.good;

public class MainApp {

    public static void main(String[] args) {
        SQLDBConnector sqldbConnector = new SQLDBConnector();
        DBConnectorService dbConnectorService = new DBConnectorService(sqldbConnector);
        dbConnectorService.connectToDB();
    }

}
