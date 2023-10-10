package com.homeworks.solid.isp.bad.impl;

import com.homeworks.solid.isp.bad.CommonDoWork;

public class Student implements CommonDoWork {

    @Override
    public void doJobWork() {
    }

    @Override
    public void doHomeWork() {
        System.out.print("do home work");
    }

    @Override
    public void doHobbies() {
        System.out.print("do hobbies");
    }
}
