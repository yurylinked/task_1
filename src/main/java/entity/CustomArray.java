package entity;

import java.util.Arrays;
import java.util.List;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public CustomArray(List<String> strings) {
    }

    public CustomArray(String[] strings) {
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (this.getClass() != o.getClass()) return false;
        CustomArray otherArray = (CustomArray) o;
        if (!Arrays.equals(otherArray.array, this.array))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
