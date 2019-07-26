
public class MergeSort {

	public static void main(String[] args) {
		int[] array2 = { 75, 26, 66, 49, 58, 31, 49, 5, 1, 1, 9 };
		System.out.println("Array before sort:");
		for (int item : array2) {
			System.out.print(item + " ");
		}
		
		mergeSort(array2, 0, array2.length - 1);
		System.out.println();
		System.out.println("Array after sort:");
		for (int item : array2) {
			System.out.print(item + " ");
		}
	}

	private static void merge(int[] array, int left, int middle, int right) {
		int leftArrayLength = middle - left + 1;
		int rightArrayLength = right - middle;
		int leftArrayIndex = 0;
		int rightArrayIndex = 0;
		int mergedArrayIndex = left;

		int[] leftArray = new int[leftArrayLength];
		for (int index = 0; index < leftArrayLength; ++index) {
			leftArray[index] = array[left + index];
		}
		
//		System.out.println("Left array: ");
//		for(int i: leftArray)
//		{
//			System.out.print(i + " ");
//		}
//		System.out.println();

		int[] rightArray = new int[rightArrayLength];
		for (int index = 0; index < rightArrayLength; ++index) {
			rightArray[index] = array[middle + 1+index]; // 注意 此处加1
		}
		System.out.println();
		System.out.println("Right array: ");
		for(int j: rightArray)
		{
			System.out.print(j+ " ");
		}
		leftArrayIndex = 0;
		rightArrayIndex = 0;
		while (leftArrayIndex < leftArrayLength && rightArrayIndex < rightArrayLength) {
			if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
				array[mergedArrayIndex] = leftArray[leftArrayIndex];
				leftArrayIndex++;
			} else {
				array[mergedArrayIndex] = rightArray[rightArrayIndex];
				rightArrayIndex++;
			}
			mergedArrayIndex++;
		}

		while (leftArrayIndex < leftArrayLength) {
			array[mergedArrayIndex] = leftArray[leftArrayIndex];
			leftArrayIndex++;
			mergedArrayIndex++;
		}

		while (rightArrayIndex < rightArrayLength) {
			array[mergedArrayIndex] = rightArray[rightArrayIndex];
			rightArrayIndex++;
			mergedArrayIndex++;
		}
	}

	private static void mergeSort(int[] array, int l, int r) {
		if (l < r) {
			int m = (l+ r) / 2;
//			System.out.println();
//			System.out.println("Left: " + l + " m: " + m + " right: " + r);
			mergeSort(array, l, m);
			//System.out.println("after left sort: ");
			for (int index = l; index < m; index++) {
			//	System.out.print(array[index] + " ");
			}
			mergeSort(array, m + 1, r);
			merge(array, l, m, r);
		}
	}
}
