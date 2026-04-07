package d_s_f.bezahlungArt;

public class PayPal  implements PayStrategy {
    @Override
    public String getType() {
        return "PyPal";
    }

    @Override
    public String pay(double total) {
        return "Ich bezahle "+total+" mit paypal";
    }
}