public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 3, 1, 2, 4};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(numbers);  // Output: Array sorted using Bubble Sort

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sort(numbers);  // Output: Array sorted using Quick Sort

        sorter.setStrategy(new MergeSortStrategy());
        sorter.sort(numbers);  // Output: Array sorted using Merge Sort
    }
}
