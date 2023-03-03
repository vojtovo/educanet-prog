package Cviceni_2023_03_03;

public class Main {
    public static void vypisJmeno(Clovek cl) {
        // Polymorfismus - očekáváme instanci třídy Clovek, můžeme dosadit jakoukoliv jinou
        // třídu, která třídu Clovek extenduje (rozšiřuje)
        System.out.println(cl.getJmeno());
    }

    public static void main(String[] args) throws Exception {
        Student st1 = new Student("Jan");
        Ucitel uc1 = new Ucitel("Jenda");

        Main.vypisJmeno(st1);
        Main.vypisJmeno(uc1);

        try {
            st1.pridejZnamku(2);
            st1.pridejZnamku(4);
            st1.pridejZnamku(7);
        } catch (Exception ex) {
            System.out.println("Zadali jste neplatnou známku!");
        }

        // Princip abstrakce - nemusíme vědět, jak počítá objekt průměr
        System.out.println(st1.getPrumer());
    }
}
