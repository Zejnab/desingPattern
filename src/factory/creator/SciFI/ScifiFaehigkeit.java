package factory.creator.SciFI;

import factory.creator.basic.FaehigkeitSystem;

public class ScifiFaehigkeit implements FaehigkeitSystem {
    @Override
    public String printInfo() {
        return "Hacking";
    }

    @Override
    public int demage() {
        return 70;
    }
}
