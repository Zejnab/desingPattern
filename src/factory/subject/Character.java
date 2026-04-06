package factory.subject;
import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;

public interface Character {

    void angreifen();
    void verteidigen();
    void faehigkeitEinsetzen();
}
