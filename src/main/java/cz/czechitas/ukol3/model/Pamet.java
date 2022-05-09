package cz.czechitas.ukol3.model;


public class Pamet {
    public long kapacita;

    public long getKapacita(){
        return kapacita;
    }

    public void setKapacita(long kapacita){
        this.kapacita = kapacita;
}
    public String toString() {
        return "Paměť tohoto počítače je " + kapacita + "." ;
    }
    }


