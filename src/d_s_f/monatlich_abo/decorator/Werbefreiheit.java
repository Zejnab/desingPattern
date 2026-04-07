package d_s_f.monatlich_abo.decorator;

import d_s_f.monatlich_abo.Abo;

public class Werbefreiheit extends Decorator{

    public Werbefreiheit(Abo bestellung) {
        super(bestellung);
    }

    @Override
    public String describe() {
        return super.describe()+ " Werbefreiheit ";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
