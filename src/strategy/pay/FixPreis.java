package strategy.pay;

public class FixPreis implements PayStrategy{
    @Override
    public double calculate(Abbrechnung abrechnung) {
        abrechnung.clearUnpaid();
        abrechnung.addCount();

        if(abrechnung.getCount()!=1)
            return 0;

        //Man bezahlt nur einaml
        if(!abrechnung.isRabat()){
            return abrechnung.getAccountType().getBasisPreis()+100;
        }
        return abrechnung.getAccountType().getBasisPreis()+90;
    }

    @Override
    public String methodExplain() {
        return "FixPreis: Man bezahlt nur einmal Accountgrundpreis+100_ Mit Rabatt: Grundpreis+90";
    }
}
