import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Vytvorení dvou objektu prodejcu, pridala jsem tam vsechny parametry
        ProdejceBioMrkve prodejce1 = new ProdejceBioMrkve(
                "Jan Novak",
                LocalDate.of(1985,5,15),
                120,
                50.5,
                "Praha",
                "3B56078",
                6.8
        );
        ProdejceBioMrkve prodejce2 = new ProdejceBioMrkve(
                "Petr Svoboda",
                LocalDate.of(1990,8,20),
                80,
                30.0,
                "Brno",
                "XYZ-4567",
                7.2
        );

        //Vypis jmen prodejcu
        System.out.println("Prodejce 1: " + prodejce1.getJmeno());
        System.out.println("Prodejce 2: " + prodejce2.getJmeno());
    }
}