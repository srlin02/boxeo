package uf4.boxeo.part1;

public class Boxeador {
    private String nom;
    public int atacs;
    public boolean un;
    public boolean dos;
    public boolean tres;
    public boolean zero;
    public boolean actiu;

    public Boxeador() {
        nom = "";
        atacs = 0;
        un = false;
        dos = false;
        tres = false;
        zero = false;
        actiu = true;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
