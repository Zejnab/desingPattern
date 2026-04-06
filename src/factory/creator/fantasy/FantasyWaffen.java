package factory.creator.fantasy;

import factory.creator.basic.WaffenSystem;

public class FantasyWaffen implements WaffenSystem {
    @Override
    public String printInfo() {
        return "Dein Waffe ist Schwert. Sein Demage ist "+demage();
    }

    @Override
    public int demage() {
        return 20;
    }
}
