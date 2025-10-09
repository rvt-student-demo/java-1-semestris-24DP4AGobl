package rvt;
import java.util.Scanner;

public class Gift_Tax {
    public static void main(String argd[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the value of the gift:");
        int gift_Value = Integer.valueOf(scanner.nextLine());

        int tax = 0;
        
        if (gift_Value < 5000) {
            System.out.println("Tax does not apply");
        } else if (gift_Value > 5000 && gift_Value <= 25000) {
            tax = 100 + gift_Value / 100 * 8;
        } else if (gift_Value > 55000 && gift_Value <= 55000) {
            tax = 1700 + gift_Value / 100 * 10;
        } else if (gift_Value > 55000 && gift_Value <= 200000) {
            tax = 4700 + gift_Value / 100 *12;
        } else if (gift_Value > 200000 && gift_Value <= 1000000){
            tax = 22100 + gift_Value / 100 * 15;
        } else {
            tax = 142100 + gift_Value / 100 * 17;
        }

        System.out.println("Your tax is " + tax);
    }
}
