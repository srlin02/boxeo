package uf4.boxeo.part1;

public class Main {
    public static void main(String[] args) {
        // Objectes creats
        Boxeador b1 = new Boxeador();
        b1.setNom("Boxeador1");
        Boxeador b2 = new Boxeador();
        b2.setNom("Boxeador2");

        // Iniciem el combat
        Combat.iniciCombat(b1, b2);
    }
}
