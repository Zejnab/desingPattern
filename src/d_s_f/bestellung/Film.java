package d_s_f.bestellung;

import d_s_f.monatlich_abo.Abo;

public class Film extends Inhalt {

    public Film(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+4;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
