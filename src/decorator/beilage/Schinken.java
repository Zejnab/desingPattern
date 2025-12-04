package decorator.beilage;

import decorator.beilage.abstractBeilagen.AbstractBeilage;
import decorator.pizza.interfacePizza.IPizza;

public class Schinken extends AbstractBeilage {
    public Schinken(IPizza iPizza){
        super(iPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung()+ " Schinken ";
    }
}
