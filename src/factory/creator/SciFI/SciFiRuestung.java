package factory.creator.SciFI;

import factory.creator.basic.Ruestung;

public class SciFiRuestung implements Ruestung {

    @Override
    public String printInfo() {
        return "NanoSuit, Verteidigung: "+verteidigung();
    }

    @Override
    public int verteidigung() {
        return 40;
    }
}
