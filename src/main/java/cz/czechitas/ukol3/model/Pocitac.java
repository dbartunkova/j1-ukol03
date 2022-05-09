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

    public void zapniSe() {

        System.out.println("Počítač je zapnutý.");
    }

    public boolean getJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }


    public String vypniSe() {
        return "Počítač je vypnutý";
    }
}




