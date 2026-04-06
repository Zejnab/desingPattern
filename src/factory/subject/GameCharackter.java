package factory.subject;

import factory.creator.CharacterFactory;
import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;

public class GameCharackter implements Character{
    private FaehigkeitSystem faehigkeitSystem;
    private Ruestung ruestung;
    private WaffenSystem waffenSystem;

    public GameCharackter(CharacterFactory factory){
        faehigkeitSystem=factory.createFaehigkeit();
        ruestung= factory.createRuestung();
        waffenSystem= factory.createWaffe();
    }
    @Override
    public void angreifen() {
        System.out.println(waffenSystem.printInfo());
    }

    @Override
    public void verteidigen() {
        System.out.println(ruestung.printInfo());
    }

    @Override
    public void faehigkeitEinsetzen() {
        System.out.println(faehigkeitSystem.printInfo());
    }
}
