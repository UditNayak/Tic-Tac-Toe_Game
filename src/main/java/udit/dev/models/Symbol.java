package udit.dev.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Symbol {
    private char achar;

    public Symbol(char achar) {
        this.achar = achar;
    }
}
