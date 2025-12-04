package decorator.pizza;

import decorator.pizza.interfacePizza.IPizza;

public class MittelPizza implements IPizza {
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getBeschreibung() {
        return "Preis: "+getPrice()
                +"\n ein mitteles Pizza mit omatensauße, Gewürze und Käse. "
                +"\n Ihre Beilage: ";
    }
}
