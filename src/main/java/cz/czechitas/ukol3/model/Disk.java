package cz.czechitas.ukol3.model;

public class Disk {
    public long kapacita;

    public long vyuziteMisto;

    public long getKapacita(){
        return kapacita;
    }

    public void setKapacita(long kapacita){
        this.kapacita = kapacita;
    }

    public String toString() {
        return "Kapacita počítače je" + " " + kapacita + "a využité místo je" + " " +vyuziteMisto + ".";
    }

}
