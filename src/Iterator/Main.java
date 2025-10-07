package Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        for (int number : fibonacciSequence) {
            System.out.println(number);

            if (number > 1000) {
                break;
            }
        }
    }
}
