package Cviceni_2023_02_24;

import java.util.Scanner;

public class ObvodAObsahKruznice {
    public static void main(String[] args) {
        /**
         * Pomocí třídy Scanner se zeptejte uživatele na poloměr kružnice, spočítejte
         * obvod a obsah kružnice pomocí metod v třídě Math.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte poloměr: ");
        double polomer = sc.nextDouble();

        double obvod = 2 * Math.PI * polomer;
        double obsah = Math.PI * Math.pow(polomer, 2);

        System.out.println("Obvod kružice: " + obvod);
        System.out.println("Obsah kružice: " + obsah);
    }
}
