package com.homeworks.solid.ocp.bad;

public class MainApp {

    public static void main(String[] args) {
        DBConnectorService dbConnectorService = new DBConnectorService();
        dbConnectorService.setDbType("sql");
        
        dbConnectorService.connectToDB();
    }

}
