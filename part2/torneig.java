package uf4.boxeo.part2;

import uf4.boxeo.part1.Boxeador;

import java.util.Random;

public class torneig {
    public static Boxeador iniciCombat(Boxeador b1, Boxeador b2) {

        // Creem el objecte random
        Random random = new Random();

        // Mentre els dos boxeadors estiguin actius seguirà repetint.
        while (b1.actiu && b2.actiu) {

            // Generem els numeros aleatoris
            int atac1 = random.nextInt(4);
            int atac2 = random.nextInt(4);
            int def1 = random.nextInt(4);
            int def2 = random.nextInt(4);

            // Atac b1 a b2
            if (atac1 == def1){
                switch (atac1) {
                    case 0:
                        b2.zero = true;
                        break;
                    case 1:
                        b2.un = true;
                        break;
                    case 2:
                        b2.dos = true;
                        break;
                    case 3:
                        b2.tres = true;
                        break;
                }
                if (b2.zero && b2.un && b2.dos && b2.tres) {
                    b2.actiu = false;
                    return b1;
                }
            }
            // Atac b2 a b1
            if (atac2 == def2){
                switch (atac2) {
                    case 0:
                        b1.zero = true;
                        break;
                    case 1:
                        b1.un = true;
                        break;
                    case 2:
                        b1.dos = true;
                        break;
                    case 3:
                        b1.tres = true;
                        break;
                }
                if (b1.zero && b1.un && b1.dos && b1.tres) {
                    b1.actiu = false;
                    return b2;
                }
            }
        }
        return null;
    }
}
