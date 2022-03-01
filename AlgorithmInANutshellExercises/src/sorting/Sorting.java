package sorting;

class InsertionSort {
    public InsertionSort() {
        System.out.println("InsertionSort");
    }

    void sort(int[] inputArray) {
        for (int i = 1; i <= inputArray.length - 1; i++) {
	    insert(inputArray, i, inputArray[i]);
        }
    }
    
    private void insert(int[] array, int pos, int value) {
        int i = pos - 1;
        while (i >= 0 && array[i] > value) {
            array[i + 1] = array[i];
            i = i - 1;
        }
        array[i + 1] = value;
    }
}

public class Sorting {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = { 15, 9, 8, 1, 4, 11, 7, 12, 13, 6, 5, 3, 16, 2, 10, 14 };
        insertionSort.sort(array);
        print(array);
    }
    private static void print(int[] array) {
	for (int i = 0; i <= array.length - 1; i++) {
        System.out.println(array[i]);
        }
    }
}
