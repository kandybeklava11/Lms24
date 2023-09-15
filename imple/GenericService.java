package imple;

import Model.Person;

import java.util.List;
import java.util.Scanner;

public interface GenericService<T> {
    void add(List<T> t, Scanner scanner);
    T getById(List<T> t, Long id);
    List<T> getAll(List<T> t);
    List<T> sortByName(List<T> t);
    List<T> clear(List<T> t);
}
