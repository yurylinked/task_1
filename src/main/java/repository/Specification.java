package repository;

import entity.CustomArray;

public interface Specification <T>{
    public boolean specify(CustomArray customArray);
}
