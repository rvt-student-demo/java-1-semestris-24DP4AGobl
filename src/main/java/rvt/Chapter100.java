package rvt;
import java.util.Scanner;

public class Chapter100 {
    public static void main(String[] args){
        int numerator = 0;
        int divisor = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the numerator: ");

            String numeratorChecker = scanner.nextLine();

            if (String.valueOf(numeratorChecker.charAt(0)).contains("q") || String.valueOf(numeratorChecker.charAt(0)).contains("Q")) {
                break;
            } else {
                try {
                    numerator = Integer.valueOf(numeratorChecker);
                
                    System.out.print("Enter the divisor: ");
                    divisor = Integer.valueOf(scanner.nextLine());
    
                    int result = numerator / divisor ;
    
                    System.out.println(numerator + " / " +  divisor + " is " + result);
                }
    
                catch (NumberFormatException ex) {
                    System.out.println("You entered bad data. \n" +
                                        "Please try again.");
                } 
                catch (ArithmeticException ex) {
                    System.out.println("You can't divide " + numerator + " by " + divisor);
                }
                System.out.println();
            }
        }
    }
}
