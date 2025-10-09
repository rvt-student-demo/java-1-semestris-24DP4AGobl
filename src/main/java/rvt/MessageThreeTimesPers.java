package rvt;
import java.util.Scanner;

public class MessageThreeTimesPers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");

        String name = scanner.nextLine();

        System.out.println("Your name is " + name + ".");


        System.out.println("What is your age: ");

        String age = scanner.nextLine();

        System.out.println("You are " + age + " Years old.");
    }
}