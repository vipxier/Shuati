
public class bubbleSort {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 2;
		array[2] = 12;
		array[3] = 20;
		array[4] = 1;

		// bubbleSort(array);
		bubbleSortWhile(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, i, j);
				}
			}
		}
	}

	public static void bubbleSortWhile(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		boolean looped = false;
		int lastIndexOfUnsortedArray = array.length - 1;
		do {
			for (int index = 0; index < lastIndexOfUnsortedArray; index++) {
				if (array[index] > array[index + 1]) {
					swap(array, index, index + 1);
				}
			}
			if (lastIndexOfUnsortedArray >= 1)
				lastIndexOfUnsortedArray--;
			else
				break;
			looped = true;

		} while (looped);
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
