package com.homeworks.solid.isp.good.impl;

import com.homeworks.solid.isp.good.StudentDoWork;

public class Student implements StudentDoWork {

    @Override
    public void doHomeWork() {
        System.out.println("do home work");
    }

    @Override
    public void doHobbies() {
        System.out.println("do hobbies");
    }
}
