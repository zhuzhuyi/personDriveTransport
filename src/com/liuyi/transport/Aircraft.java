package com.liuyi.transport;

public class Aircraft extends Transport {
    @Override
    public void addGas() {

    }

    @Override
    public void DriveMethod(){
        System.out.println("需要飞艇驾驶员在紧急情况下人工驾驶，" +
                "其余都是按照提前预设好的情况飞行");
    }

    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }
}
