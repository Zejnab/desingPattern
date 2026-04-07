package strategy.streams;

public class Serie extends Inhalt {

    public Serie(double dauer, String name) {
        super(dauer, 7.0, name);
    }

    @Override
    public String getDeteil() {
        return super.getName()+"-> dauer: "+super.getDauer()+" , preis: "+super.getBasisperis();
    }
}
