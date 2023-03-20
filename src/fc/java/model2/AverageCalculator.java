package fc.java.model2;

public class AverageCalculator<T extends Number> {
    private T[] numbers;

    public AverageCalculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (T number : numbers) {
          sum+=number.doubleValue();
        }
        return sum/numbers.length;
    }
}
