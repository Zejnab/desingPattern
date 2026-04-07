package strategy.streams;

public class Live extends Inhalt {

    public Live(double dauer, String name) {
        super(dauer, 1.5, name);
    }

    @Override
    public String getDeteil() {
        return super.getName()+"-> dauer: "+super.getDauer()+" , preis: "+super.getBasisperis();
    }
}