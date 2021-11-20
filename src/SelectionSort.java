import java.util.Random;

/**
 * See note about C-style '{'
 *
 * Example Java-style:
 *
 * 	class SelectionSort {
 *
 * vs. C-style:
 *
 *  class SelectionSort
 *  {
 *
 */
class SelectionSort
{
	void sort(int arr[]) 
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < n; j++)
				/*
				TODO - use braces { ... } after conditionals, even when it's just one line of code
					Even though Java doesn't require it for a single line of code, it is
					convention to use braces because it makes the code easier to understand
					and MUCH less prone hiding a sneaky bug
				 */
				if (arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
void printArray(int arr[])
{
	int n = arr.length;
	for (int i = 0; i < n; ++i) // TODO - use {}
		System.out.print(arr[i] + " ");
	System.out.println();
}
public static void main (String args[])
{
	SelectionSort testList2 = new SelectionSort(); // TODO - why testList2?  Names can cause confusion!
	//int arr[] = {27,11,9,17,6,28};
	long start = System.nanoTime(); // good name
	Random r = new Random(); // maybe name this one 'random' instead of 'r'
	int[] arr = new int[50];
	for (int i = 0; i < arr.length; i++) { // good use of { ... }
		arr[i] = r.nextInt(50);
	}
	testList2.sort(arr);
	testList2.printArray(arr);
	long end = System.nanoTime(); // good name
	long total = end - start; // good name, and the other good names make this expression very easy to understand
	System.out.println(total);
}
}
