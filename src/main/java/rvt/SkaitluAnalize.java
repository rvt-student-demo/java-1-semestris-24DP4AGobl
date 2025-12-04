package rvt;
import java.util.Scanner;

public class SkaitluAnalize{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int count = 0;
        int sum = 0;
        int biggest = 0;
        int smallest = 0;

        while (true){
            System.out.print("Ievadi pozitīvu skaitli(0 vai negatīvs skaitlis pārtrauc Ievadi): ");
            number = Integer.valueOf(scanner.nextLine());

            if (number <= 0){
                break;
            }
            if (biggest == 0 && smallest == 0) {
            biggest = number;
            smallest = number;
            }

            if (biggest < number) {
                biggest = number;
            }
            if (smallest > number) {
                smallest = number;
            }

            count += 1;
            sum += number;
            
        }

        double avg = Double.valueOf(sum) / count;


        System.out.println("Ievadīto skaiļu skaits: " + count);
        System.out.println("Skaitļu summa: " + sum);
        System.out.println("Vidējā vērtība: " + avg);
        System.out.println("Lielākaids skaitlis: " + biggest);
        System.out.println("Mazākais skaitlis: " + smallest);
    }
}