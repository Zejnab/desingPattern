package strategy.accounts;

public class Student implements Account{
    public final double  basisPreis=2;
    @Override
    public String getInfo() {
        return "Student-> Preis: "+basisPreis;
    }

    @Override
    public double getBasisPreis() {
        return basisPreis;
    }
}