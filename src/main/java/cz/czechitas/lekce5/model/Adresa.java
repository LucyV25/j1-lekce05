package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;
    private Osoba osoba;

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Ulice nemůže být prázdná.");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdná.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("PSC nemůže být prázdné.");
            return;
        }
        if (psc.length()!=5) {
            System.err.println("psc musí obsahovat 5 znaků.");
            return;
        }
        this.psc = psc;
    }

    public String toString() {
        return ulice + ", " +castObce + ", " +psc+ " " + obec;
    }
}
