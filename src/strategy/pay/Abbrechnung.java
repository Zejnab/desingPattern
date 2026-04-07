package strategy.pay;

import lombok.Getter;
import lombok.Setter;
import strategy.accounts.Account;
import strategy.streams.Inhalt;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Abbrechnung {
    private List<Inhalt> notPaid;
    private List<Inhalt> paid;
    private boolean rabat;
    private Account accountType;
    private double totalPayed;
    private int count;

    public Abbrechnung(boolean rabatt, Account account){
        this.rabat=rabatt;
        this.accountType=account;
        this.totalPayed=0;
        this.count=0;
        this.notPaid=new ArrayList<>();
        this.paid=new ArrayList<>();

    }

    public void setTotalPayed(double totalPayed) {
        this.totalPayed += totalPayed;
    }
    public void addCount(){
        this.count+=1;
    }

    public void clearUnpaid(){
        notPaid.clear();
    }
    public void addUnpaid(Inhalt inhalt) {
        notPaid.add(inhalt);
    }
    public void unpaidToPaid(){
        paid.addAll(notPaid);
        clearUnpaid();
    }
    public void addPaid(Inhalt inhalt){
        paid.add(inhalt);
    }
    public boolean inhaltContain(String name, Class<? extends Inhalt> aClass) {
        for(Inhalt inhalt:paid){
            if(inhalt.getName().equals(name) && inhalt.getClass().equals(aClass))
                return true;
        }
        return false;
    }
}
