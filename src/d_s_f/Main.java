package d_s_f;

import d_s_f.Abo.AboFactory;
import d_s_f.bestellung.Ebook;
import d_s_f.bestellung.Film;
import d_s_f.bezahlungArt.Kreditkarte;
import d_s_f.bezahlungArt.PayPal;
import d_s_f.monatlich_abo.Abo;
import d_s_f.bezahlungArt.PayStrategy;
import d_s_f.bestellung.Inhalt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AboFactory factory = new AboFactory();
        Inhalt inhalt1 = new Film("Film");

        //EinzelKauf
        PayStrategy payStrategy1 = new Kreditkarte();
        Abo einzel=factory.createEinzelKauf(inhalt1);
        Nutzer n=new Nutzer(einzel,payStrategy1 );
        System.out.println(n.pay());


        //Monatlich:
        Abo monatlich = factory.createMonatlich(true, true, false, false);
        System.out.println("Abo Kosten: "+monatlich.getPrice());
        System.out.println("Abo describe: "+ monatlich.describe());

        PayStrategy payStrategy = new PayPal();

        Nutzer n1=new Nutzer(monatlich, payStrategy);
        System.out.println(n1.pay());
        Inhalt inhalt = new Ebook("book");
        n1.addInhalt(inhalt);
        System.out.println(n1.getKonsum().toString());
    }
}