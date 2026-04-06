package factory.creator.SciFI;

import factory.creator.basic.WaffenSystem;

public class SciFiWaffen implements WaffenSystem {
    @Override
    public String printInfo() {
        return "LaserGun, demage: "+demage();
    }

    @Override
    public int demage() {
        return 50;
    }
}
