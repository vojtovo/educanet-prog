package Cviceni_2020_02_24b;

public class Character {
    /**
     * Momentální zdraví
     */
    private double zdravi;

    /**
     * Síla útoku
     */
    private double silaUtoku;

    /**
     * Šance na kritický zásah
     */
    private double sanceNaCritical;

    /**
     * Kolikrát bude znásoben útok při
     * kritickém zásahu
     */
    private double nasobicCriticalu;

    private String jmeno;

    public Character(double zdravi, double silaUtoku, double sanceNaCritical, double nasobicCriticalu, String jmeno) {
        this.zdravi = zdravi;
        this.silaUtoku = silaUtoku;
        this.sanceNaCritical = sanceNaCritical;
        this.nasobicCriticalu = nasobicCriticalu;
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getZdravi() {
        return zdravi;
    }

    public void setZdravi(double zdravi) {
        this.zdravi = zdravi;
    }

    public double getSilaUtoku() {
        return silaUtoku;
    }

    public void setSilaUtoku(double silaUtoku) {
        this.silaUtoku = silaUtoku;
    }

    public double getSanceNaCritical() {
        return sanceNaCritical;
    }

    public void setSanceNaCritical(double sanceNaCritical) {
        this.sanceNaCritical = sanceNaCritical;
    }

    public double getNasobicCriticalu() {
        return nasobicCriticalu;
    }

    public void setNasobicCriticalu(double nasobicCriticalu) {
        this.nasobicCriticalu = nasobicCriticalu;
    }
}
