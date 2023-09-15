import Model.Animal;
import Model.Person;
import imple.ServiceImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) 
        List<Object> objects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ServiceImple<Object> service = new ServiceImple<>();

        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Add a new person or animal");
            System.out.println("2. Get a person or animal by ID");
            System.out.println("3. Get all persons and animals");
            System.out.println("4. Sort by name");
            System.out.println("5. Clear the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new person or animal:");
                    service.add(objects, scanner);
                    break;
                case 2:
                    System.out.println("Getting person or animal by ID:");
                    System.out.print("Enter ID: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    Object item = service.getById(objects, id);
                    if (item != null) {
                        System.out.println("Item found:");
                        System.out.println(item);
                    } else {
                        System.out.println("Item not found.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Getting all persons and animals:");
                    List<Object> allItems = service.getAll(objects);
                    for (Object obj : allItems) {
                        System.out.println(obj);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Sorting by name:");
                    List<Object> sortedList = service.sortByName(objects);
                    for (Object obj : sortedList) {
                        System.out.println(obj);
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Clearing the list:");
                    List<Object> clearedList = service.clear(objects);
                    System.out.println("List cleared.");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println();
            }
        }


    }
}
