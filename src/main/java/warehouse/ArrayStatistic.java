package warehouse;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayStatistic {
    private OptionalInt minValue;
    private OptionalInt maxValue;
    private OptionalInt sumElements;
    private OptionalDouble averageValue;

    public ArrayStatistic(OptionalInt minValue, OptionalInt maxValue, OptionalInt sumElements, OptionalDouble averageValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.sumElements = sumElements;
        this.averageValue = averageValue;
    }

    public OptionalInt getMinValue() {
        return minValue;
    }

    public void setMinValue(OptionalInt minValue) {
        this.minValue = minValue;
    }

    public OptionalInt getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(OptionalInt maxValue) {
        this.maxValue = maxValue;
    }

    public OptionalInt getSumElements() {
        return sumElements;
    }

    public void setSumElements(OptionalInt sumElements) {
        this.sumElements = sumElements;
    }

    public OptionalDouble getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(OptionalDouble averageValue) {
        this.averageValue = averageValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayStatistic)) return false;
        ArrayStatistic that = (ArrayStatistic) o;
        return Objects.equals(minValue, that.minValue) && Objects.equals(maxValue, that.maxValue) && Objects.equals(sumElements, that.sumElements) && Objects.equals(averageValue, that.averageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, maxValue, sumElements, averageValue);
    }

    @Override
    public String toString() {
        return "ArrayParametrs{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", sumElements=" + sumElements +
                ", averageValue=" + averageValue +
                '}';
    }
}
