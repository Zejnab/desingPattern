package d_s_f.monatlich_abo.decorator;

import d_s_f.monatlich_abo.Abo;

public class PremiumZugang extends Decorator{

    public PremiumZugang(Abo bestellung) {
        super(bestellung);
    }
    @Override
    public String describe() {
        return super.describe()+ " Premium-Zugang ";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }
}
