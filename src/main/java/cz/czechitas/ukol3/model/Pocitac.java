package cz.czechitas.ukol3.model;

public class Pocitac {
    public boolean jeZapnuty;
    Procesor cpu = new Procesor();
    Pamet ram = new Pamet();
    Disk pevnyDisk = new Disk();

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void setRam(Pamet danciPamet) {
    }

    public void setCpu(Procesor danciProcesor) {
    }

    public void setPevnyDisk(Disk danciDisk) {
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
            } else {
                System.out.println("Počítač se zapnul");
                return jeZapnuty;
            }
        }


    public Boolean vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul");
            return jeZapnuty;
        } else {
            System.out.println("Počítač je už vypnutý");
            return jeZapnuty;
        }
    }

}




