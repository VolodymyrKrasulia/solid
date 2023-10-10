package com.homeworks.solid.isp.good.impl;

import com.homeworks.solid.isp.good.WorkerDoWork;

public class Worker implements WorkerDoWork {

    @Override
    public void doHobbies() {
        System.out.println("do hobbies");
    }

    @Override
    public void doJobWork() {
        System.out.println("do job work");
    }
}
