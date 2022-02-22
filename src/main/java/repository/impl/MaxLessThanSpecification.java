package repository.impl;

import entity.CustomArray;
import exception.CustomException;
import repository.Specification;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;

public class MaxLessThanSpecification implements Specification {
    private int max;
    public MaxLessThanSpecification(int max) {
        this.max = max;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayService service=new CustomArrayServiceImpl();
        int maxOfElements = service.findMaxValue(customArray);
        return max<maxOfElements;
    }
}
