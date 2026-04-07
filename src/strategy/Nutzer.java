package strategy;

import lombok.Getter;
import lombok.Setter;
import strategy.accounts.Account;
import strategy.pay.Abbrechnung;
import strategy.pay.PayStrategy;
import strategy.streams.Inhalt;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Nutzer {
    private List<Inhalt> inhalts;
    private Abbrechnung abbrechnung;
    private PayStrategy payStrategy;

    public Nutzer(Account accountType, boolean rabatt, PayStrategy payStrategy) {
        this.inhalts = new ArrayList<>();
        this.abbrechnung=new Abbrechnung(rabatt,accountType);
        this.payStrategy = payStrategy;
    }

    public void addInhalt(Inhalt inhalt) {
        inhalts.add(inhalt);
        abbrechnung.addUnpaid(inhalt);

    }

    public double pay() {
        double pay_total=this.payStrategy.calculate(abbrechnung);
        abbrechnung.setTotalPayed(pay_total);
       return pay_total;

    }

    public void sawInhalt() {
        for (Inhalt inhalt : inhalts) {
            System.out.println(inhalt.getDeteil());
        }
    }

    public void nutzerInfo(){
        System.out.println("Inhalte: ");
        sawInhalt();
        System.out.println("PayMethode: ");
        payStrategy.methodExplain();
        System.out.println("AccountType: "+abbrechnung.getAccountType().getInfo());
        System.out.println("Rabatt: "+ abbrechnung.isRabat());
    }

}
