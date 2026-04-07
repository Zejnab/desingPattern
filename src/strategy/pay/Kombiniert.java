package strategy.pay;

import strategy.accounts.Account;
import strategy.streams.Inhalt;

import java.util.ArrayList;
import java.util.List;

public class Kombiniert implements PayStrategy {

    @Override
    public double calculate(Abbrechnung abrechnung) {
        double payTotal=0;

        for(Inhalt inhalt: abrechnung.getNotPaid()){
            System.out.println(inhalt.getName());
            if(!abrechnung.inhaltContain(inhalt.getName(), inhalt.getClass())){
                payTotal+=inhalt.getBasisperis();  //Jede Inhalt wird nur einmal bezahlt auch wenn man sie mehrmals sieht
                abrechnung.addPaid(inhalt);
            }
        }

        if(abrechnung.isRabat()){
            return abrechnung.getAccountType().getBasisPreis()+payTotal-4;
        }

        return abrechnung.getAccountType().getBasisPreis()+payTotal;
    }

    @Override
    public String methodExplain() {
        return "Kombiniert: Jede  Inhalt(die man zum ersten mal gesehn hat)+Grundpreis  _ Mit Rabatt: 4 Euro weniger";
    }
}
