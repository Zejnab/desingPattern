package d_s_f.monatlich_abo.subject;

import d_s_f.monatlich_abo.Abo;

public class Monatlich implements Abo {
    @Override
    public String describe() {
        return "Monatlich: ";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
