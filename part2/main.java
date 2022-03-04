package uf4.boxeo.part2;

import uf4.boxeo.part1.Boxeador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static uf4.boxeo.part2.torneig.iniciCombat;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        // Importem el arxiu de participants i el guardem en un scanner
        File participantsFile = new File("C:\\Users\\linpi\\IdeaProjects\\Java\\src\\uf4\\boxeo\\part2\\participants.txt");
        Scanner sc = new Scanner(participantsFile);

        // Crearem el arraylist dels participants de cada ronda, i la de guanyadors de la ronda
        ArrayList<Boxeador> participants = new ArrayList<Boxeador>();
        ArrayList<Boxeador> guanyadors = new ArrayList<Boxeador>();

        // Introduirem tots els participants a la llista participants
        while (sc.hasNextLine()) {
            Boxeador boxeador = new Boxeador();
            String nom = sc.nextLine();
            boxeador.setNom(nom);
            participants.add(boxeador);
        }


        // Fem ua comprovació, si el numero de participants no es multiple de 4 no podem fer les
        // rondes correctament, ja que si no passaran a ser imparells, i no es podrà seguir.
        int total = participants.size();
        int potencia = (int) (Math.log(total) / Math.log(2));
        if (Math.pow(2, potencia) != total) {
            System.out.println("El numero de participants no es valid, el numero total ha de ser potencia de 2");
            return;
        }

        // Comença el torneig
        int numronda = 1;
        int partRest = participants.size();

        // Es repetira mentre participants Restants siguin mes gran que 1
        while (partRest > 1) {
            System.out.println("RONDA-" + numronda);
            // En aquest for mirarem tots els participants de la llista
            for (int i = participants.size(); i > 0; i = i - 2) {
                Boxeador b1 = participants.get(0);
                Boxeador b2 = participants.get(1);
                Boxeador guanyador = iniciCombat(b1, b2);
                System.out.println(b1.getNom() + " VS " + b2.getNom() + "--> " + guanyador.getNom());
                guanyadors.add(guanyador);
                participants.remove(b1);
                participants.remove(b2);
            }
            participants.clear();
            participants.addAll(guanyadors);
            partRest = participants.size();
            guanyadors.clear();
            numronda++;
            System.out.println(" ");
        }

        String NomGuanyador = participants.get(0).getNom();
        // Anunciem el guanyador
        System.out.println("Guanyador: " + NomGuanyador+"!!!");
    }
}
