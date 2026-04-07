package strategy.streams;

public class Film extends Inhalt {

    public Film(double dauer, String name) {
        super(dauer, 5.8, name);
    }

    @Override
    public String getDeteil() {
        return super.getName()+"-> dauer: "+super.getDauer()+" , preis: "+super.getBasisperis();
    }
}
