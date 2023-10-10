package com.homeworks.solid.ocp.good;

public class NonSQLDBConnector implements DBConnector{

    @Override
    public void connect() {
        System.out.println("connecting to a non-relational db...");
    }
}
