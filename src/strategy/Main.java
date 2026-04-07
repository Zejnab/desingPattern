package strategy;

import strategy.accounts.Account;
import strategy.accounts.Standard;
import strategy.pay.Kombiniert;
import strategy.pay.PayStrategy;
import strategy.pay.ProInhalt;
import strategy.streams.Inhalt;
import strategy.streams.Live;
import strategy.streams.Serie;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PayStrategy payStrategy = new Kombiniert();
        Account account=new Standard();
        Nutzer nutzer = new Nutzer(account, false,payStrategy);
        Inhalt inhalt = new Live(12,"JJ Live");
        Inhalt k    =   new Live(12, "JJ Live");
        nutzer.addInhalt(inhalt);
        nutzer.addInhalt(k);
        System.out.println("Pay: "+nutzer.pay());
        nutzer.addInhalt(new Serie(33, "BB"));
        System.out.println("Pay: "+nutzer.pay());
        nutzer.nutzerInfo();

    }
}
