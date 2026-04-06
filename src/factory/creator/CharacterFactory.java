package factory.creator;

import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;

public interface CharacterFactory {
    WaffenSystem createWaffe();
    Ruestung createRuestung();
    FaehigkeitSystem createFaehigkeit();
}
