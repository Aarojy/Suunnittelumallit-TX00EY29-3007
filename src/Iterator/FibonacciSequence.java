package Iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence, Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
