package strategy.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Inhalt {
    private double dauer;
    private double basisperis;
    private String name;

    public abstract String getDeteil();
}
