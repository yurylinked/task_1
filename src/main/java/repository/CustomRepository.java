package repository;

import entity.CustomArray;

import java.util.Comparator;
import java.util.List;


public interface CustomRepository {
    void add(CustomArray customArray);

    void remove(CustomArray customArray);

    void get(int index);

    List query(Specification specification);

    List<CustomArray> sort(Comparator<CustomArray> comparator);
}


