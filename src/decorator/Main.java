package decorator;

import decorator.beilage.Garnelen;
import decorator.beilage.Spinat;
import decorator.beilage.Zwiebeln;
import decorator.pizza.GroßPizza;
import decorator.pizza.interfacePizza.IPizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ihre Bestellung");

        IPizza bestellung=new Spinat(new Garnelen(new Zwiebeln(new GroßPizza())));

        System.out.println(bestellung.getBeschreibung());
        System.out.println("Preis: "+bestellung.getPrice());

    }
}