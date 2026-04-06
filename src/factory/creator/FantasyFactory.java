package factory.creator;

import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;
import factory.creator.fantasy.FantasyFaehigkeit;
import factory.creator.fantasy.FantasyRuestung;
import factory.creator.fantasy.FantasyWaffen;

public class FantasyFactory implements CharacterFactory{
    @Override
    public WaffenSystem createWaffe() {
        return new FantasyWaffen();
    }

    @Override
    public Ruestung createRuestung() {
        return new FantasyRuestung();
    }

    @Override
    public FaehigkeitSystem createFaehigkeit() {
        return new FantasyFaehigkeit();
    }
}
