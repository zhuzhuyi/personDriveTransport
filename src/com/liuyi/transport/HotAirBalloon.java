package com.liuyi.transport;

public class HotAirBalloon extends Transport {
    @Override
    public void DriveMethod(){
        System.out.println("在连接到丙烷罐的管道上打开一个简单的爆炸阀，" +
                "丙烷放的越多，热气球就飞得越高。" +
                "打开降落伞阀以降低气球");
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
