
public class CountingSort {
	
	public static void main(String[] args)
	{
		CountingSort cs = new CountingSort();
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 
                'r', 'g', 'e', 'e', 'k', 's'
                }; 
		cs.countSortChar(arr);
		System.out.print("\nSorted character array is "); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i]); 
	}

	public void countSortChar(char[] array) {
		int n = array.length;
		char[] output = new char[n];
		int[] count = new int[256];
		
		for(int index = 0; index<array.length; index++)
		{
			count[array[index]]++;
		}
		
		for(int index = 1; index < count.length; index++)
		{
			count[index] += count[index-1];
		}
		
		for(int index = 0; index < array.length; index++)
		{
			output[count[array[index]]-1] = array[index];
			count[array[index]]--;
		}
		
		for(int index = 0; index< output.length; index ++)
		{
			array[index] = output[index];
		}
		
	}
}
