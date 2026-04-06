package factory.creator.fantasy;

import factory.creator.basic.FaehigkeitSystem;

public class FantasyFaehigkeit implements FaehigkeitSystem {
    @Override
    public String printInfo() {
        return "Feuerball";
    }

    @Override
    public int demage() {
        return 30;
    }
}
