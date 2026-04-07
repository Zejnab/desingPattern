package d_s_f.monatlich_abo.decorator;

import d_s_f.monatlich_abo.Abo;

public class Student extends Decorator {
    public Student(Abo bestellung) {
        super(bestellung);
    }

    @Override
    public String describe() {
        return "Student";
    }

    @Override
    public double getPrice() {
        return super.getPrice()-2;
    }
}
