package d_s_f.bezahlungArt;

public interface PayStrategy {
     String getType();
     String pay(double total);

}
