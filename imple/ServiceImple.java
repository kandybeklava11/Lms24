package imple;

import Model.Animal;
import Model.Person;

import java.util.*;

public class ServiceImple<T> implements GenericService<T> {
    List<T> list = new ArrayList<>();


    @Override
    public void add(List<T> t, Scanner scanner) {
        System.out.println("1. Add person");
        System.out.println("2. Add animal");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Чтение символа новой строки после ввода числа

        switch (choice) {
            case 1:
                System.out.println("Enter person details:");
                System.out.println("Enter person name");
                String personName = scanner.nextLine();
                System.out.println("Enter person age");
                int personAge = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки после ввода числа

                Person person = new Person(personName, personAge);
                t.add((T) person);
                System.out.println("Person added successfully.");
                System.out.println(person);
                System.out.println();
                break;
            case 2:
                System.out.println("Enter animal details:");
                System.out.println("Enter animal name");
                String animalName = scanner.nextLine();
                System.out.println("Enter animal age");
                int animalAge = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки после ввода числа

                Animal animal = new Animal(animalName, animalAge);
                t.add((T) animal);
                System.out.println("Animal added successfully.");
                System.out.println(animal);
                System.out.println();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    @Override
    public T getById(List<T> t, Long id) {
        for (T item : t) {
            if (item instanceof Person) {
                Person person = (Person) item;
                if (person.getId().equals(id)) {
                    return item;
                }
            } else if (item instanceof Animal) {
                Animal animal = (Animal) item;
                if (animal.getId().equals(id)) {
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public List<T> getAll(List<T> t) {
        return new ArrayList<>(t);
    }

    @Override
    public List<T> sortByName(List<T> t) {
        List<T> sortedList = new ArrayList<>(t);
        sortedList.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                String name1 = null;
                String name2 = null;
                if (o1 instanceof Person) {
                    name1 = ((Person) o1).getName();
                } else if (o1 instanceof Animal) {
                    name1 = ((Animal) o1).getName();
                }
                if (o2 instanceof Person) {
                    name2 = ((Person) o2).getName();
                } else if (o2 instanceof Animal) {
                    name2 = ((Animal) o2).getName();
                }
                if (name1 != null && name2 != null) {
                    return name1.compareToIgnoreCase(name2);
                }
                return 0;
            }
        });
        return sortedList;
    }

    @Override
    public List<T> clear(List<T> t) {
        t.clear();
        return t;
    }
}
