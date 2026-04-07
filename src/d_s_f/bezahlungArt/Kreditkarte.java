package d_s_f.bezahlungArt;

public class Kreditkarte implements PayStrategy {
    @Override
    public String getType() {
        return "KreditKarte";
    }

    @Override
    public String pay(double total) {
        return "Ich bezahle "+total+" mit kreditKart";
    }
}
