package strategy.pay;
public interface PayStrategy {
    double calculate(Abbrechnung abbrechnung);
    String methodExplain();
}
