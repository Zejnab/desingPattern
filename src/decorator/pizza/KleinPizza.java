package decorator.pizza;

import decorator.pizza.interfacePizza.IPizza;

public class KleinPizza implements IPizza {
    @Override
    public double getPrice() {
        return 7;
    }

    @Override
    public String getBeschreibung() {
        return "ein kleines Pizza mit omatensauße, Gewürze und Käse. "
                +"\n Ihre Beilage: "
                +"\n Preis: "+getPrice();
    }
}
