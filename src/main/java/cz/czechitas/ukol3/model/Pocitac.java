package cz.czechitas.ukol3.model;

public class Pocitac {
    public boolean jeZapnuty;
    Procesor cpu = new Procesor();
    Pamet ram = new Pamet();
    Disk pevnyDisk = new Disk();
    public long velikost;
    public long kapacita;
    public long vyuziteMisto;


    public void setRam(Pamet danciPamet) {
    }

    public void setCpu(Procesor danciProcesor) {
    }

    public void setPevnyDisk(Disk danciDisk) {
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public boolean getJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }


    public boolean zapniSe() {
        if (ram == null) {
            System.err.println("Není možno zapnout počítač.");
            return jeZapnuty;
        } else if (jeZapnuty == true) {
            System.out.println("Počítač se zapnul.");
            return jeZapnuty;
        } else {
            System.err.println("Počítač není možno zapnout dvakrát.");
        }
        return jeZapnuty;
    }

    public boolean vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul");
            return jeZapnuty;
        } else {
            System.out.println("Počítač je už vypnutý");

        return jeZapnuty;
        }}

    public long vytvorSouborOVelikosti(long velikost){
        this.velikost = velikost;
        if (velikost < kapacita) {
           return vyuziteMisto + velikost;
        }
        return velikost;
    }


}