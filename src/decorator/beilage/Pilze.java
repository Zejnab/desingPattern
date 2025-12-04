package decorator.beilage;

import decorator.beilage.abstractBeilagen.AbstractBeilage;
import decorator.pizza.interfacePizza.IPizza;

public class Pilze  extends AbstractBeilage {
    public Pilze(IPizza iPizza){
        super(iPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung()+ " Pilze ";
    }
}
