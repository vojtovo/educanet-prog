package Cviceni_2023_02_24;

import java.util.Random;

public class Kostka {
    public static void main(String[] args) {
        /**
         * Napiště program, který provede sto hodů kostkou a spočítá četnost pádů
         * jednotlivých čísel a průměrné hozené číslo.
         */

        int pocetHodu = 1500;

        Random rnd = new Random();
        int[] cetnost = new int[6];

        for (int i = 0; i < pocetHodu; i++) {
            int aktualniHod = rnd.nextInt(6) + 1;
            cetnost[aktualniHod - 1]++;
        }

        int soucetHodu = 0;
        for (int i = 0; i < cetnost.length; i++) {
            System.out.println("Číslo " + (i + 1) + " hozeno " + cetnost[i]);
            soucetHodu += (i + 1) * cetnost[i];
        }

        double prumer = (double) soucetHodu / (double) pocetHodu;
        System.out.println("Průměr z hodů: " + prumer);
    }
}
