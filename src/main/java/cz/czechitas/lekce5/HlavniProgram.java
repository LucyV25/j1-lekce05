package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;


/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {


//        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Telefon luckyTelefon = new Telefon();
        luckyTelefon.setPredcisli("+420");
        luckyTelefon.setTelefonniCislo("777101222");

        Osoba lucka= new Osoba();
        lucka.setJmeno("Lucka");
        lucka.setPrijmeni("Veselá");
        lucka.setZena(true);
        lucka.setRodneCislo("905520/0002");
        lucka.setTelefon(luckyTelefon);
        lucka.setPracovniEmail("pracovni@ahoj.cz");
        lucka.setSoukromyEmail("ahoj@sdf.cz");
        System.out.println("Telefon: "+ lucka.getTelefon());
        System.out.println(lucka);

        Adresa luckyAdresa= new Adresa();
        luckyAdresa.setUlice("Prazska");
        luckyAdresa.setObec("Praha");
        luckyAdresa.setCastObce("Horni Pocernice");
        luckyAdresa.setPsc("11000");

        System.out.println("celá adresa je: "+luckyAdresa.toString());
        System.out.println("kontaktni udaje jsou Telefon: " + lucka.getTelefon().toString()+", "+lucka.getKontakty());


    }

}
