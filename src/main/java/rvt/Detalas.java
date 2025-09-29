package rvt;
import java.util.Scanner;

public class Detalas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        //Pricing

        System.out.println("Bob's discount bolts pricing and rules:\n");

        System.out.println("•  5 centi par skrūvi");
        System.out.println("•  3 centi par uzgriezni");
        System.out.println("•  1 cents par paplāksni");

        System.out.println("uzgriežņi = skrūves, paplākšņi x 2 than skrūves\n\n");

        System.out.print("Skruvju skaits: ");
        int bolt = Integer.valueOf(scanner.nextLine());

        System.out.print("Uzgriežņu skaits: ");
        int nut = Integer.valueOf(scanner.nextLine());

        System.out.print("Paplākšņu skaits: ");
        int washer = Integer.valueOf(scanner.nextLine());

        final int bolt_Price = 5;
        final int nut_Price = 3;
        final int washer_Price = 1;

        if (bolt == nut && washer >= nut*2){
            System.out.println("Pasūtījums kārtībā.");
        } else if (bolt != nut && washer < nut*2){
            System.out.println("Pārbaudīt pasūtijumu: par maz uzgriežņi vai skrubju daudzums nav vienāds ar uzgrižņu daudzumu un par maz paplākšņi vai par daudz skrūves.");
        } else if (washer < nut*2) {
            System.out.println("Pārbaudīt pasūtījumu: par maz paplākšņi vai pa daudz skrūves.");
        } else if (bolt != nut) {
            System.out.println("Pārbaudīt pasūtījumu: par maz uzgriežņi vai skruvju daudzums nav vienads ar uzgriežņu daudzumu.");
        }

        System.out.println("\nKopējā cena: " + (bolt*bolt_Price + nut * nut_Price + washer*washer_Price) + "ceti");
    }
}
