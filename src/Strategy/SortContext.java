package Strategy;

public class SortContext {
    private Sort strategy;

    public void setStrategy(Sort strategy) {
        this.strategy = strategy;
    }

    public int[] sortArray(int[] arr) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.sort(arr);
    }
}
