package cz.czechitas.ukol3.model;

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
