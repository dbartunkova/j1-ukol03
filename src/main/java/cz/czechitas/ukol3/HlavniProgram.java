package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        System.out.println("Program spuštěn.");
        Pocitac danciPocitac = new Pocitac();
        System.out.println(danciPocitac.toString());

        Procesor danciProcesor = new Procesor();
        danciProcesor.rychlost = (2_100_000_000_000L);
        danciProcesor.setRychlost(2_100_000_000_000L);
        danciProcesor.vyrobce = "HP inc.";
        danciProcesor.setVyrobce("HP inc");

        Pamet danciPamet = new Pamet();
        danciPamet.kapacita = 8_000_000_000L;
        danciPamet.setKapacita(8_000_000_000L);

        Disk danciDisk = new Disk();
        danciDisk.kapacita = 128_000_000_000L;
        danciDisk.setKapacita(128_000_000_000L);

        danciPocitac.setCpu(danciProcesor);
        danciPocitac.setRam(danciPamet);
        danciPocitac.setPevnyDisk(danciDisk);

        System.out.println(danciProcesor.toString());
        System.out.println(danciPamet.toString());
        System.out.println(danciDisk.toString());
        System.out.println(danciPocitac.toString());

        danciPocitac.vypniSe();
        danciPocitac.zapniSe();


    }

}
