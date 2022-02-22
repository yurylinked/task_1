package repository.impl;

import entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import repository.CustomRepository;
import repository.Specification;

import java.util.*;
import java.util.stream.Collectors;

public class CustomRepositoryImpl implements CustomRepository {
    private static final Logger logger = LogManager.getLogger();
    private static CustomRepositoryImpl instance;
    private List<CustomArray> repository = new ArrayList<>();

    public static CustomRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new CustomRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void add(CustomArray customArray) {
        repository.add(customArray);
    }

    @Override
    public void remove(CustomArray customArray) {
        repository.remove(customArray);
    }

    @Override
    public void get(int index) {
        repository.get(index);
    }

    @Override
    public List query(Specification specification) {
       List<CustomArray> customArrayList= repository.stream().filter(o->specification.specify(o)).collect(Collectors.toList());
        return customArrayList;
    }

    @Override
    public List sort(Comparator<CustomArray> comparator) {
        // final SortedSet<ArrayStatistic> statistics = new TreeSet<>(specification);
        List <CustomArray> sortedList = repository.stream().sorted(comparator).collect(Collectors.toList());
        return sortedList;
    }
}


