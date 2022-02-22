package repository.impl;

import entity.CustomArray;
import repository.Specification;

public class AverageSpecification implements Specification {
    private double sum;

    public AverageSpecification(double sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return false;
    }
}
