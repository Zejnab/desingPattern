package d_s_f.Abo;

import d_s_f.bestellung.Inhalt;
import d_s_f.monatlich_abo.Abo;
import d_s_f.monatlich_abo.decorator.Offline_download;
import d_s_f.monatlich_abo.decorator.PremiumZugang;
import d_s_f.monatlich_abo.decorator.Student;
import d_s_f.monatlich_abo.decorator.Werbefreiheit;
import d_s_f.monatlich_abo.subject.Monatlich;

public class AboFactory {

    public Abo createEinzelKauf(Inhalt bestellung){
        return new EinzelKauf(bestellung);
    }

    public Abo createMonatlich(boolean offline, boolean werbefreiheit, boolean student, boolean premium){
        Abo abo = new Monatlich();

        if (offline) {
            abo = new Offline_download(abo);
        }
        if (werbefreiheit) {
            abo = new Werbefreiheit(abo);
        }
        if (student) {
            abo = new Student(abo);
        }
        if (premium) {
            abo = new PremiumZugang(abo);
        }

        return abo;

    }
}
