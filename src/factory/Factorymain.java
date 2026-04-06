package factory;


import factory.creator.CharacterFactory;
import factory.creator.FantasyFactory;
import factory.creator.SciFiFactory;
import factory.subject.Character;
import factory.subject.GameCharackter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorymain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wählen Sie den Modus:");
        System.out.println("1) Fantasy");
        System.out.println("2) Sci-Fi");

        int auswahl = Integer.parseInt(br.readLine());

        CharacterFactory factory;

        switch (auswahl) {
            case 1 -> factory = new FantasyFactory();
            case 2 -> factory = new SciFiFactory();
            default -> throw new IllegalArgumentException("Ungültige Auswahl");
        }
        Character character=new GameCharackter(factory);
        character.verteidigen();
        character.angreifen();
        character.faehigkeitEinsetzen();
    }
}
