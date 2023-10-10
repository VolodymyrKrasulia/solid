package com.homeworks.solid.isp.bad.impl;

import com.homeworks.solid.isp.bad.CommonDoWork;

public class Worker implements CommonDoWork {

    @Override
    public void doJobWork() {
        System.out.println("do job work");
    }

    @Override
    public void doHomeWork() {

    }

    @Override
    public void doHobbies() {
        System.out.print("do hobbies");
    }
}
