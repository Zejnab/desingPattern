package factory.creator.fantasy;

import factory.creator.basic.Ruestung;

public class FantasyRuestung implements Ruestung {
    @Override
    public String printInfo() {
        return "Leder- oder Eisenrüstung, Verteidigung: "+verteidigung();
    }

    @Override
    public int verteidigung() {
        return 40;
    }
}
