package Cviceni_2023_03_03;

// Student rozšiřuje třídu Clovek, princip dědičnosti
public class Student extends Clovek {
    private int sumaZnamek = 0;
    private int pocetZnamek = 0;

    public Student(String jmeno) {
        super(jmeno);
    }

    public void pridejZnamku(int znamka) throws Exception {
        if (!(znamka >= 1 && znamka <=5)) {
            throw new Exception("znamka mimo rozsah");
        }

        this.sumaZnamek += znamka;
        this.pocetZnamek++;
    }

    public double getPrumer() {
        // pro jednoduchost nepočítáme vážený průměr
        return sumaZnamek / pocetZnamek;
    }
}
