package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayListl{
    public static void main(String args[]) {
        onlyTheseNumbers();
        listSize();
        onTheList();

        
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        removeLast(strings);

        System.out.println(strings);
    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;

        while (true) {
            n = Integer.valueOf(scanner.nextLine());
            if (n == -1) {
                break;
            }
            list.add(n);
        }

        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        for (int i = start; i != end; i ++) {
            System.out.println(list.get(i));
        }
    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input = "null";

        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
        }
        list.add(input);

        System.out.println("In total: " + list.size());
    }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<> ();
        String name = "null";

        while (true) {
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            list.add(name);
        }

        System.out.println("Search for? ");
        String search = scanner.nextLine();
        Boolean found = false;

        for (int i = 0; i < (list.size()); i ++) {
            if (list.get(i).equals(search)) {
                found = true;
            }
        }


        System.out.println();
        if (found == true) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
}