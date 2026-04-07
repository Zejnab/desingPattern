package d_s_f.monatlich_abo.decorator;

import d_s_f.monatlich_abo.Abo;

public class Offline_download extends Decorator{
    public Offline_download(Abo bestellung) {
        super(bestellung);
    }

    @Override
    public String describe() {
        return super.describe()+ " Offline-Download ";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+5;
    }
}
