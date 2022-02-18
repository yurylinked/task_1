package entity;

import observer.ArrayEvent;
import observer.Observable;
import observer.ArrayObserver;
import util.CustomGeneratorId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class CustomArray implements Observable {
    private long id;
    private int[] array;
    private List<ArrayObserver> arrayObservers = new ArrayList<>();


    public CustomArray(int[] array) {
        this.id = CustomGeneratorId.getInstance().getId();
        this.array = array.clone();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = CustomGeneratorId.getInstance().getId();
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArray)) return false;
        CustomArray that = (CustomArray) o;
        return id == that.id && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "id=" + id +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void attach(ArrayObserver observer) {
        arrayObservers.add(observer);
    }

    @Override
    public void detach(ArrayObserver observer) {
        arrayObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ArrayObserver observer : arrayObservers) {
            observer.updateParametrs(new ArrayEvent(this));
        }
    }
}
