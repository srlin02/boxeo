package uf4.boxeo.part1;

import java.util.Random;

public class Combat {
    public static void iniciCombat(Boxeador b1, Boxeador b2) {

        // Capçalera
        System.out.println("Combat entre " + b1.getNom() + " & " + b2.getNom());
        System.out.println("-------------------------------------");
        System.out.println(" ");

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
                        System.out.println(b1.getNom() + " -> Cop a cap!");
                        break;
                    case 1:
                        b2.un = true;
                        System.out.println(b1.getNom() + " -> Cop dreta!");
                        break;
                    case 2:
                        b2.dos = true;
                        System.out.println(b1.getNom() + " -> Cop esquerra!");
                        break;
                    case 3:
                        b2.tres = true;
                        System.out.println(b1.getNom() + " -> Cop panxa!");
                        break;
                }
                if (b2.zero && b2.un && b2.dos && b2.tres) {
                    b2.actiu = false;
                    System.out.println(b2.getNom() + " -> RIP");
                    System.out.println(" ");
                    System.out.println(b1.getNom() + " -> Guanyador!!!");
                    return;
                }
            }else{
                System.out.println(b2.getNom() + " -> Protegit!");
            }

            // Atac b2 a b1
            if (atac2 == def2){
                switch (atac2) {
                    case 0 -> {
                        b1.zero = true;
                        System.out.println(b2.getNom() + " -> Cop a cap!");
                        break;
                    }
                    case 1 -> {
                        b1.un = true;
                        System.out.println(b2.getNom() + " -> Cop dreta!");
                        break;
                    }
                    case 2 -> {
                        b1.dos = true;
                        System.out.println(b2.getNom() + " -> Cop esquerra!");
                        break;
                    }
                    case 3 -> {
                        b1.tres = true;
                        System.out.println(b2.getNom() + " -> Cop panxa!");
                        break;
                    }
                }
                if (b1.zero && b1.un && b1.dos && b1.tres) {
                    b1.actiu = false;
                    System.out.println(b1.getNom() + " -> KO!");
                    System.out.println(" ");
                    System.out.println(b2.getNom() + " -> Guanya!");
                    return;
                }
            }else{
                System.out.println(b1.getNom() + " -> Protegit!");
            }
        }
    }
}
