package repository;

import entity.CustomArray;

import java.util.Comparator;
import java.util.List;

// Creating a repository interface, in example the repository
// using Generics by this way we can implement the same repository in a different classes.
// Generics = code reuse.

public interface CustomRepository<T> {
    void add(CustomArray customArray);

    void remove(CustomArray customArray);

    void get(int index);

    List querry(Specification<T> specification);

    List<CustomArray> sort(Comparator<CustomArray> comparator);
}


