package d_s_f.monatlich_abo.decorator;

import d_s_f.monatlich_abo.Abo;
import lombok.Getter;

@Getter
public  abstract class Decorator implements Abo {
    private Abo bestellung;

    public Decorator(Abo bestellung){
        this.bestellung=bestellung;
    }

    @Override
    public String describe() {
        return bestellung.describe();
    }

    @Override
    public double getPrice() {
        return bestellung.getPrice();
    }
}
