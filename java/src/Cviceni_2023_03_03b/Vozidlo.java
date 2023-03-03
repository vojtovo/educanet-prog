package Cviceni_2023_03_03b;

public class Vozidlo {
    private String typ;
    private int pocetKol;
    private double maximalniRychlost;
    private String barva;

    private boolean motorNastartovany = false;

    private double stavNadrzeProcent = 0;

    public Vozidlo(String typ, int pocetKol, double maximalniRychlost, String barva) {
        this.typ = typ;
        this.pocetKol = pocetKol;
        this.maximalniRychlost = maximalniRychlost;
        this.barva = barva;
    }

    public String toString() {
        return "Ahoj, já jsem " +
                this.typ + ", moje barva je " +
                this.barva + ", mám " +
                this.pocetKol + " kol, jedu maximálně " +
                this.maximalniRychlost;
    }

    public void natankuj() {
        this.stavNadrzeProcent = 100;
    }

    public void nastartuj() throws Exception {
        if (this.motorNastartovany) {
            throw new Exception("Motor je již nastartovaný");
        }

        if (this.stavNadrzeProcent <= 0) {
            throw new Exception("Došla PHM");
        }

        this.motorNastartovany = true;
    }

    public boolean isMotorNastartovany() {
        return this.motorNastartovany;
    }
}
