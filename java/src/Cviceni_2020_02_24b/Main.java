package Cviceni_2020_02_24b;

import java.util.Random;

public class Main {
    private static void zautoc(Character a, Character b) {
        System.out.println(a.getJmeno() + " zautocil na " + b.getJmeno());

        double silaUtoku = a.getSilaUtoku();
        Random rnd = new Random();
        if (rnd.nextDouble(100) >= (100 - a.getSanceNaCritical())) {
            System.out.println("Kriticky zasah!");
            silaUtoku *= a.getNasobicCriticalu();
        }
        b.setZdravi(b.getZdravi() - silaUtoku);

        System.out.println(b.getJmeno() + " ztratil " + silaUtoku + " zdravi, zbyva mu " + b.getZdravi());
    }

    public static void main(String[] args) {
        Character ch1 = new Character(
            1000.0,
            20.0,
            50.0,
            30.0,
            "Pepa"
        );
        Character ch2 = new Character(
            20000.0,
            10.0,
            20.0,
            2.0,
            "Franta Pavel"
        );

        while (true) {
            Main.zautoc(ch1, ch2);
            if (ch2.getZdravi() <= 0) {
                System.out.println("Vyhral " + ch1.getJmeno());
                break;
            }

            Main.zautoc(ch2, ch1);
            if (ch1.getZdravi() <= 0) {
                System.out.println("Vyhral " + ch2.getJmeno());
                break;
            }
        }
    }
}
