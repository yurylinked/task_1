package repository.impl;

import entity.CustomArray;
import repository.Specification;

public class IdSpecification implements Specification {
    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getId()==id;
    }
}
