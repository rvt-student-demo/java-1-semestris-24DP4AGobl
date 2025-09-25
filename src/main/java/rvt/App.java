package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cik tev ir gadu?");
        int age = Integer.valueOf(scanner.nextLine());

        boolean isAdult = age >= 18;

        if (age >= 18) {
            System.out.println("Tu esi pilngadigs.");
        }else{
            System.out.println("Tu esi nepilngadigs, piekluves nav.");
        }

        if (isAdult){
            System.out.println("Tu esi pilngadigs.");
        }else{
            System.out.println("Tu esi nepilngadigs, piekluves nav.");
        } 
    }
}
