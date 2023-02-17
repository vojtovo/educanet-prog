package Cviceni_2023_02_17;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Naprogramujte aplikaci, která bude na vstupu přijímat dvě hodnoty a operaci.
         * Kalkulačka poběží v nekonečném cyklu a bude moct být ukončena zapsáním „konec“.
         */

        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double vysledek = 0;
        String operace;
        String znakOperace = "";
        while (true) {
            System.out.print("Zadej operaci (secti, odecti, znasob, vydel, konec): ");
            operace = sc.next();

            if (operace.equals("konec")) {
                break; // zde break prerusuje vykonani cyklu
            }

            System.out.print("Zadej hodnotu a: ");
            a = sc.nextDouble();

            System.out.print("Zadej hodnotu b: ");
            b = sc.nextDouble();

            switch (operace) {
                case "secti":
                    vysledek = a + b;
                    znakOperace = "+";
                    break; // zde break pouze ukoncuje switch case
                case "odecti":
                    vysledek = a - b;
                    znakOperace = "-";
                    break;
                case "znasob":
                    vysledek = a * b;
                    znakOperace = "*";
                    break;
                case "vydel":
                    vysledek = a / b;
                    znakOperace = "/";
                    break;
                default:
                    System.out.println("Neplatna operace, zkus to znovu.");
                    continue; // continue rika, ze chceme preskocit zbytek tela cyklu a provest dalsi iteraci
            }

            System.out.format("%f %s %f = %f \n", a, znakOperace, b, vysledek);
        }
    }
}