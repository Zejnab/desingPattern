package strategy.accounts;

public class Premium implements Account{
    public final double  basisPreis=15;
    @Override
    public String getInfo() {
        return "Premium-> Preis: "+basisPreis;
    }

    @Override
    public double getBasisPreis() {
        return basisPreis;
    }
}
