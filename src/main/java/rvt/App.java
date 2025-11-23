package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics userInputStats = new Statistics();
        Statistics userInputOddN = new Statistics();
        Statistics userInputEvenN = new Statistics();

        System.out.println("==[          Statistics          ]==");

        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());


        System.out.println("\n");


        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                userInputEvenN.addNumber(number);
            } else if (number % 2 != 0) {
                userInputOddN.addNumber(number);
            }
            userInputStats.addNumber(number);
        }
        System.out.println("Sum: " + userInputStats.sum());
        System.out.println("Sum of even numbers: " + userInputEvenN.sum());
        System.out.println("Sum of odd number: " + userInputOddN.sum());


        System.out.println("\n");


        System.out.println("==[          Payment card          ]==");

        PaymentCard paulsCard = new PaymentCard(20, "Paul");
        PaymentCard mattsCard = new PaymentCard(30, "Matt");

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard);
        System.out.println(mattsCard);
    }
}
