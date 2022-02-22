package repository.impl;

import entity.CustomArray;
import repository.Specification;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;

public class MinLessThanSpecification implements Specification {
    private int min;

    public MinLessThanSpecification(int min) {
        this.min = min;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayService service=new CustomArrayServiceImpl();
        int minOfElements = service.findMinValue(customArray);
        return min<minOfElements;
    }
}
