package strategy.accounts;

public class Standard implements Account{
   public final double  basisPreis=5;
    @Override
    public String getInfo() {
        return "Standard-> Preis: "+basisPreis;
    }

    @Override
    public double getBasisPreis() {
        return basisPreis;
    }
}
