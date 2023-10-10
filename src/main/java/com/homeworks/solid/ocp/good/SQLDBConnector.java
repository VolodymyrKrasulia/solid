package com.homeworks.solid.ocp.good;

public class SQLDBConnector implements DBConnector{

    @Override
    public void connect() {
        System.out.println("connect to a relational db...");
    }
}
