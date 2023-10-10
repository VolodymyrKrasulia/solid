package com.homeworks.solid.ocp.bad;

public class DBConnectorService {
    
    private String dbType;

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public void connectToDB() {
        switch (dbType) {
            case "sql" -> System.out.println("connecting to a relational db...");
            case "nosql" -> System.out.println("connecting to a non-relational db...");
            default-> System.out.println("Error");
        }
    }
    
}
