package sorting;

class InsertionSort {
	public InsertionSort() {
		// TODO Auto-generated constructor stub
		System.out.println("InsertionSort");
	}
	void sort(int[] A) {
		for(int i = 1; i <= A.length - 1; i++) {
			insert(A, i, A[i]);
		}
	}

	private void insert(int[] A, int pos, int value) {
		// TODO Auto-generated method stub
		int i = pos - 1;
		while(i >= 0 && A[i] > value) {
			A[i + 1] = A[i];
			i = i - 1;
		}
		A[i + 1] = value;
	}
}

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort insertionSort =  new InsertionSort();
		int[] A = {15, 9, 8, 1, 4, 11, 7, 12, 13, 6, 5, 3, 16, 2, 10, 14};
		insertionSort.sort(A);
		print(A);
	}	
	
	private static void print(int[] A) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= A.length - 1; i++) {
			System.out.println(A[i]);
		}
	}
}
