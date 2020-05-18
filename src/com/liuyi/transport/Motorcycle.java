package com.liuyi.transport;

public class Motorcycle extends Transport{
    @Override
    public void DriveMethod() {
        System.out.println("带上安全帽"
                +"1、离合打火，然后挂1档，慢松离合加油门" +
                "     2、升档，略加油门，快捏离合把手"
                +"      3、刹车:一般刹车时，都是先刹车，后捏离合");
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
