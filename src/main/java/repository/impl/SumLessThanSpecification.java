package repository.impl;

import entity.CustomArray;
import exception.CustomException;
import repository.Specification;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;

public class SumLessThanSpecification implements Specification {
    private int sum;

    public SumLessThanSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayService service=new CustomArrayServiceImpl();
        int sumOfElements = service.countSumOfElements(customArray);
        return sum<sumOfElements;
    }
}
