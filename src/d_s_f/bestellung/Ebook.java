package d_s_f.bestellung;

public class Ebook extends Inhalt {

    public Ebook(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
