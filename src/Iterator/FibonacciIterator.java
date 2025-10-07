package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 1;
    private int current = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = previous;
        int newCurrent = previous + current;
        previous = current;
        current = newCurrent;
        return nextValue;
    }
}
