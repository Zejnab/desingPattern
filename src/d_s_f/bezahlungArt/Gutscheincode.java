package d_s_f.bezahlungArt;

public class Gutscheincode implements PayStrategy {

    @Override
    public String getType() {
        return "Gutscheincode";
    }

    @Override
    public String pay(double total) {
        return "Ich bezahle "+total+" mit Gutscheincode";
    }
}