package d_s_f.bestellung;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Inhalt {
    String name;
    double price;
    public Inhalt(String name){
        this.name=name;
        price=10;
    }
    @Override
    public String toString() {
        return name;
    }
}
