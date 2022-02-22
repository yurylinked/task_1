package warehouse;

import java.util.Objects;

public class ArrayStatistic {
    private int minValue;
    private int maxValue;
    private int sumElements;
    private double averageValue;

    public ArrayStatistic(int minValue, int maxValue, int sumElements, double averageValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.sumElements = sumElements;
        this.averageValue = averageValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getSumElements() {
        return sumElements;
    }

    public void setSumElements(int sumElements) {
        this.sumElements = sumElements;
    }

    public double getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(double averageValue) {
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
