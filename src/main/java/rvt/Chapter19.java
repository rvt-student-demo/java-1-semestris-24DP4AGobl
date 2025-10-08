package rvt;
import java.util.Scanner;

public class Chapter19{
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        ex1();
        System.out.println("Exercise 2");
        ex2();
        System.out.println("Exercise 3");
        ex3();
        System.out.println("Exercise 4");
        ex4();
        System.out.println("Exercise 5");
        ex5();
        System.out.println("Exercise 6");
        ex6();
        System.out.println("Exercise 7");
        ex7();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());

        int counter = start;

        System.out.println(counter);
        while (true) {
            if (start < end && counter != end) {
                counter += 1;
            } else if (start > end && counter != end) {
                counter -= 1;
            } else {
                break;
            }
            System.out.println(counter);
        }
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = Integer.valueOf(scanner.nextLine());

        int sum = 1;
        int count = 1;

        while(true) {
            if (count != N && N > 0) {
                count += 1;
                sum += count;
            }
            else if (count != N && N < 0) {
                count += -1;
                sum += count;
            }
            else {
                break;
            }
        }

        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + ((N * (N + 1))/2));
    }
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = Integer.valueOf(scanner.nextLine());

        int count = 1;
        int sum = 1;
        int sum_Cube = 1;

        //Square sum
        while(true) {
            if (count != N) {
                //counter
                count += 1;
                //square sum
                sum += count * count;
                //Cube sum
                sum_Cube += count * count * count;
            } else {
                break;
            }
        }

        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + (N * (N + 1) * (2 * N + 1) / 6));

        System.out.println("Cube Loop Sum = " + sum_Cube);
        System.out.println("Cube Formula Sum = " + ((N * (N + 1)) / 2) * ((N * (N + 1)) / 2));
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low:");
        int low = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter high:");
        int high = Integer.valueOf(scanner.nextLine());

        int sum_1ToHigh = (high*(high+1))/2;
        int sum_1ToLowMinus1 = ((low-1)*((low-1)+1))/2;

        System.out.println("Sum = " + (sum_1ToHigh - sum_1ToLowMinus1));
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        int wordLenght = word.length();

        while(true) {
            if (wordLenght != 0) {
                wordLenght -= 1;
                System.out.println(word);
            }
            else {
                break;
            }
        }
    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = scanner.nextLine();

        System.out.println("Enter second word:");
        String second = scanner.nextLine();

        System.out.print(first);
        int count = 0;

        while (true) {
            count += 1;
            System.out.print(".");
            if (count == (30 - first.length() - second.length())) {
                break;
            }
        }

        System.out.println(second);
    }
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int charCount = word.length();
        int charCounter = 0;

        while (true) {
            if (charCounter == charCount) {
                break;
            }
            System.out.println(word.charAt(charCounter));
            charCounter += 1;
        }
    }
}