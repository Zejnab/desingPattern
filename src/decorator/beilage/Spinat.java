package decorator.beilage;

import decorator.beilage.abstractBeilagen.AbstractBeilage;
import decorator.pizza.interfacePizza.IPizza;

public class Spinat extends AbstractBeilage {

    public Spinat(IPizza iPizza){
        super(iPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung()+ " Spinat ";
    }
}
