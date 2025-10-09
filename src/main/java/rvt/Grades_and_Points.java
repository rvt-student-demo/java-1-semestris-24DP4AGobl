package rvt;
import java.util.Scanner;

public class Grades_and_Points {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much points did you get: ");
        int points = Integer.valueOf(scanner.nextLine());

        if (points < 0) {
            System.out.println("Impossible");
        } else if (points >= 0 && points <= 49) {
            System.out.println("failed");
        } else if (points >= 50 && points <= 59) {
            System.out.println(1);
        } else if (points >= 60 && points <= 69) {
            System.out.println(2);
        } else if (points >= 70 && points <= 79) {
            System.out.println(3);
        } else if (points >= 80 && points <= 89) {
            System.out.println(4);
        } else if (points <= 100) {
            if (points >= 90){
                System.out.println(5);
            }
        } else if (points > 100) {
            System.out.println("Incredible!");
        }

    }
}