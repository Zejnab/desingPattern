package strategy.pay;

import strategy.streams.Inhalt;

public class ProInhalt implements PayStrategy{

    @Override
    public double calculate(Abbrechnung abrechnung) {
        double payTotal=0;

        abrechnung.addCount();

        if( abrechnung.getCount()==1){
            payTotal+=abrechnung.getAccountType().getBasisPreis(); //Beim ersten bezahlen, wird auch AccountPreis mitgerechnet
        }

        for(Inhalt inhalt: abrechnung.getNotPaid()){
                payTotal+=inhalt.getBasisperis();  //Jede Inhalt wird jedes mal bezahlt auch wenn man sie mehrmals sieht
        }

        abrechnung.unpaidToPaid();

        if(abrechnung.isRabat()){
            return payTotal-4;
        }

    return payTotal;
    }

    @Override
    public String methodExplain() {
        return "Pro Inhalt: Beim ersten mal bezahlt man Account Grundpreis + jed Inhalte, die man gesehen hat. _ Mit rabatt: 4 Euto weniger";
    }
}
