package decorator.beilage.abstractBeilagen;

import decorator.pizza.interfacePizza.IPizza;

public abstract class AbstractBeilage  implements IPizza {
    private IPizza iPizza;

    public AbstractBeilage(IPizza iPizza){
        this.iPizza = iPizza;
    }

    public  double getPrice(){
        return iPizza.getPrice();
    }

    public String getBeschreibung(){
        return iPizza.getBeschreibung();
    }


}
