package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Telefon {
    private String predcisli;
    private String telefonniCislo;

    public String getPredcisli() {
        return predcisli;
    }

    public void setPredcisli(String predcisli) {
        this.predcisli = predcisli;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(String telefonniCislo) {
        Objects.requireNonNull(telefonniCislo);
        if (telefonniCislo.isBlank()) {
            System.err.println("Telefonní číslo musí být vyplněno.");
            return;
        }
        if (telefonniCislo.length()!=9) {
            System.err.println("psc musí obsahovat 9 znaků.");
            return;
        }
        this.telefonniCislo = telefonniCislo;
    }

    @Override
    public String toString() {
        return predcisli+" "+ telefonniCislo;
    }
}
