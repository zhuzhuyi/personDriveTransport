package com.liuyi.transport;

public class Ship extends Transport {
    @Override
    public void DriveMethod() {
        System.out.println("检查一切的仪器是否正常；按按钮启动发动专职" +
                "若顺风可打开船帆" +
                "掌舵控制方向；关闭发动机即停止");
    }

    @Override
    public void addGas() {

    }

    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }
}
