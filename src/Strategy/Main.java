package Strategy;

import Strategy.Sorts.BubbleSort;
import Strategy.Sorts.MergeSort;
import Strategy.Sorts.QuickSort;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 3, 14, 5, 74, 23, 97, 234, 1, 532, 12, 45, 67, 89};
        SortContext context = new SortContext();
        long timeStart, timeEnd;
        double duration;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Testing sorting algorithms with a short array:");

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        context.setStrategy(new BubbleSort());

        timeStart = System.nanoTime();
        int[] bubbleSortedArray = context.sortArray(array.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Bubble Sort: ");
        for (int num : bubbleSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        context.setStrategy(new QuickSort());

        timeStart = System.nanoTime();
        int[] quickSortedArray = context.sortArray(array.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Quick Sort: ");
        for (int num : quickSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        context.setStrategy(new MergeSort());

        timeStart = System.nanoTime();
        int[] mergeSortedArray = context.sortArray(array.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Merge Sort: ");
        for (int num : mergeSortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Testing sorting algorithms with a long array:");

        int size = 200000;
        int[] longArray = new int[size];
        for (int i = 0; i < size; i++) {
            longArray[i] = (int) (Math.random() * 300);
        }

        context.setStrategy(new BubbleSort());

        timeStart = System.nanoTime();
        context.sortArray(longArray.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Bubble Sort: ");
        System.out.println();


        context.setStrategy(new QuickSort());

        timeStart = System.nanoTime();
        context.sortArray(longArray.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Quick Sort: ");
        System.out.println();


        context.setStrategy(new MergeSort());

        timeStart = System.nanoTime();
        context.sortArray(longArray.clone());
        timeEnd = System.nanoTime();

        duration = (double) (timeEnd - timeStart) / 1000000; // milliseconds

        System.out.print("Sorted array in " + duration + "ms using Merge Sort: ");
        System.out.println();
    }
}
