package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String currentTitle = scanner.nextLine();
            if (currentTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String currentPages = scanner.nextLine();

            System.out.print("Publiction year: ");
            String currentYear = scanner.nextLine();

            books.add(new Book(currentTitle, currentPages, currentYear)); // Naming the book seperately isn't needed because the books would already have an index because they are being added to a list.
        }

        System.out.println("What information will be printed?(Optins: eveything or names)");
        String option = scanner.nextLine();

        if (option.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (option.equals("names")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
