
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 2;
		array[2] = 12;
		array[3] = 20;
		array[4] = 1;

		// bubbleSort(array);
		selectionSort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void selectionSort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		for (int i = 0; i < array.length; i++) {
			int minNumberLocation = findMinimNumberLocation(array, i);
			if (minNumberLocation > i) {
				swap(array, i, minNumberLocation);
			}
		}
	}

	private static int findMinimNumberLocation(int[] array, int startLocation) {
		int minimumNumber = array[startLocation];
		int minimumNumberLocation = startLocation;
		for (int index = startLocation + 1; index < array.length; index++) {
			if (minimumNumber > array[index]) {
				minimumNumber = array[index];
				minimumNumberLocation = index;
			}
		}
		return minimumNumberLocation;
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
