package com.liuyi.transport;

public class Submarine extends Transport {
    @Override
    public void DriveMethod() {
        System.out.println("由于在海中是长时间看不见参照物的所以一般不会是个人驾驶"
                + "驾驶员的作用是汇报突发情况，然后由控制部门控制");
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
