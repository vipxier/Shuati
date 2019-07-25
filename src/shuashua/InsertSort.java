package shuashua;

public class InsertSort {
	public static void main(String[] args) {
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		int[] array2 = {75, 26, 66,49, 58, 31, 49, 5, 1, 1};

		System.out.println("Array before Sort:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Array after sort: ");
		insertSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void insertSort(int[] array) {
		for (int sortedIndex = 0; sortedIndex < array.length - 1; sortedIndex++) {
			int location = sortedIndex + 1;
			int insertValue = array[location];
			for (int index = sortedIndex; index >= 0; index--) {
				if (array[index] >= insertValue) {
					array[index+1] = array[index];
					location = index;	
				}
			}
			array[location] = insertValue;
		}
	}
}
