package decorator.pizza;

import decorator.pizza.interfacePizza.IPizza;

public class GroßPizza  implements IPizza {
    @Override
    public double getPrice() {
        return 15;
    }

    @Override
    public String getBeschreibung() {
        return "ein größes Pizza mit omatensauße, Gewürze und Käse. "
                +"\n Ihre Beilage: ";
    }
}
