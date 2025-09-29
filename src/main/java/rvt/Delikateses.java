package rvt;
import java.util.Scanner;

public class Delikateses {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadiet preci:  ");
        String product_Name = scanner.nextLine();

        System.out.print("Ievadiet cenu:  ");
        Double price = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        Integer ekspres = Integer.valueOf(scanner.nextLine());


        System.out.println("\n\nRēķins");

        System.out.println(product_Name + "    " + price);

        Double delivery_Fee = 0.00;

        if (price < 10){
            delivery_Fee = 2.00;
        } else{
            delivery_Fee = 3.00;
        }

        if (ekspres == 1) {
            delivery_Fee += 3.00;
        }

        System.out.println("piegāde" + "   " + delivery_Fee);
        System.out.println("kopā" + "      " + (price + delivery_Fee));

    }
}
