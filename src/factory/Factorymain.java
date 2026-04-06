package factory;


import factory.subject.Character;
import factory.subject.FantasyCharacter;
import factory.subject.SciFiCharacter;

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

        Character factory;

        switch (auswahl) {
            case 1 -> factory = new FantasyCharacter();
            case 2 -> factory = new SciFiCharacter();
            default -> throw new IllegalArgumentException("Ungültige Auswahl");
        }
        factory.verteidigen();
        factory.angreifen();
        factory.faehigkeitEinsetzen();
    }
}
