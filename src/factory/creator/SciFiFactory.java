package factory.creator;

import factory.creator.SciFI.SciFiRuestung;
import factory.creator.SciFI.SciFiWaffen;
import factory.creator.SciFI.ScifiFaehigkeit;
import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;

public class SciFiFactory implements CharacterFactory{

    @Override
    public WaffenSystem createWaffe() {
        return new SciFiWaffen();
    }

    @Override
    public Ruestung createRuestung() {
        return new SciFiRuestung();
    }

    @Override
    public FaehigkeitSystem createFaehigkeit() {
        return new ScifiFaehigkeit();
    }
}
