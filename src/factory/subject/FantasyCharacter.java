package factory.subject;

import factory.creator.basic.FaehigkeitSystem;
import factory.creator.basic.Ruestung;
import factory.creator.basic.WaffenSystem;
import factory.creator.fantasy.FantasyFaehigkeit;
import factory.creator.fantasy.FantasyRuestung;
import factory.creator.fantasy.FantasyWaffen;

public class FantasyCharacter implements Character{
    private FaehigkeitSystem faehigkeitSystem;
    private Ruestung ruestung;
    private WaffenSystem waffenSystem;

    public FantasyCharacter() {
        faehigkeitSystem=new FantasyFaehigkeit();
        ruestung=new FantasyRuestung();
        waffenSystem=new FantasyWaffen();
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
