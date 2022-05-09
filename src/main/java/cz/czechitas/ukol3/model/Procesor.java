package cz.czechitas.ukol3.model;

//Intel(R) Core(TM) i3-8145U CPU @ 2.10GHz   2.30 GHz
//rychlost -- CPU

public class Procesor {
    public String vyrobce;
    public long rychlost;

    public long getRychlost(){
        return rychlost;
    }
    public void setRychlost(long rychlostl) {
        this.rychlost = rychlost;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public String toString() {
        return "Výrobce počítače je" + " " + vyrobce + " " + "a jeho rychlost je" + " " + rychlost + ".";
    }
}
