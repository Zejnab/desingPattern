package d_s_f;

import d_s_f.bestellung.Inhalt;
import d_s_f.monatlich_abo.Abo;
import lombok.Getter;
import d_s_f.bezahlungArt.PayStrategy;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Nutzer {
    private Abo abo;   //Monatlich oder einProduct
    private PayStrategy payStrategy;   //Paypal Cradit code
    private List<Inhalt> konsum;   //Film oder Ebook

    public Nutzer(Abo abo,  PayStrategy strategy){
        this.abo=abo;
        this.payStrategy=strategy;
        this.konsum =new ArrayList<>();
    }

    public void addInhalt(Inhalt inhalt){
        konsum.add(inhalt);
    }

    public String pay(){
        return this.payStrategy.pay(abo.getPrice());
    }

}
