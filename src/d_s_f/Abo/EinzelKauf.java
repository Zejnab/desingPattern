package d_s_f.Abo;

import d_s_f.bestellung.Inhalt;
import d_s_f.monatlich_abo.Abo;

public class EinzelKauf implements Abo{
    private Inhalt bestellung;

    public EinzelKauf(Inhalt bestellung){
        this.bestellung=bestellung;
    }

    @Override
    public String describe() {
        return "Einzelkauf";
    }

    @Override
    public double getPrice() {
        return bestellung.getPrice();
    }
}
