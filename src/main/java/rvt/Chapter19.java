package rvt;
import java.util.Scanner;

public class Chapter19{
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    public static void ex1() {

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

        //Square sum
        while(true) {
            if (count != N) {
                count += 1;
                sum += count * count;
            } else {
                break;
            }
        }

        int sum_sqr = 1;
        //Reset count
        count = 1;
        
        //Cube sum
        while(true) {
            if (count != N) {
                count += 1;
                sum_sqr += count * count * count;
            }
            else {
                break;
            }
        }

        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + (N * (N + 1) * (2 * N + 1) / 6));

        System.out.println("Cube Loop Sum = " + sum_sqr);
        System.out.println("Cube Formula Sum = " + ((N * (N + 1)) / 2) * ((N * (N + 1)) / 2));
    }
}