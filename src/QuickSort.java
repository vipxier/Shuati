
public class QuickSort {
	
	public static void main(String[] args)
	{
		int[] array2 = { 75, 26, 66, 49, 58, 31, 49, 5, 1, 1, 9 };
		System.out.println("Array before sort:");
		for (int item : array2) {
			System.out.print(item + " ");
		}
		
		quickSort(array2, 0, array2.length - 1);
		System.out.println();
		System.out.println("Array after sort:");
		for (int item : array2) {
			System.out.print(item + " ");
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int pointer = low - 1;
		for (int index = low; index < high; index++) {
			if (array[index] <= array[high]) {
				pointer++;
				swap(array, index, pointer);
			}
		}
		swap(array, pointer + 1, high);
		return pointer + 1;
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pi = partition(array, left, right);
			quickSort(array, left, pi-1); //注意此处加1
			quickSort(array, pi + 1, right);
		}
	}

	private static void swap(int[] array, int index_1, int index_2) {
		if (index_1 != index_2 && index_1 >= 0 && index_2 >= 0) {
			int temp = array[index_1];
			array[index_1] = array[index_2];
			array[index_2] = temp;
		}
	}
}
