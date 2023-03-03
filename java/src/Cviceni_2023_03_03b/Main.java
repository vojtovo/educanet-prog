package Cviceni_2023_03_03b;

public class Main {
    public static void main(String[] args) throws Exception {
        Vozidlo[] vozy = new Vozidlo[]{
                new Auto("Volkswagen Golf", 4, 180, "červená"),
                new Auto("Škoda Fabia", 4, 180, "modrá"),
                new Motorka("pařez", 2, 60, "šedá"),
                new Motorka("BMW", 2, 160, "azurová"),
        };

        try {
            vozy[1].natankuj();
            vozy[1].nastartuj();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < vozy.length; i++) {
            System.out.println(vozy[i]);

            if (vozy[i].isMotorNastartovany()) {
                System.out.println("Dělám brm brm");
            } else {
                System.out.println("Nedělám nic");
            }
        }
    }
}
