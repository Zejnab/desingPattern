package factory.subject;

import factory.creator.SciFI.SciFiRuestung;
import factory.creator.SciFI.SciFiWaffen;
import factory.creator.SciFI.ScifiFaehigkeit;
import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;

public class SciFiCharacter implements Character{
    private FaehigkeitSystem faehigkeitSystem;
    private Ruestung ruestung;
    private WaffenSystem waffenSystem;

    public SciFiCharacter() {
        faehigkeitSystem=new ScifiFaehigkeit();
        ruestung=new SciFiRuestung();
        waffenSystem=new SciFiWaffen();
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
