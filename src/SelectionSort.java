import java.util.Random;

class SelectionSort
{
	void sort(int arr[]) 
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < n; j++)
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
	for (int i = 0; i < n; ++i)
		System.out.print(arr[i] + " ");
	System.out.println();
}
public static void main (String args[])
{
	SelectionSort testList2 = new SelectionSort();
	//int arr[] = {27,11,9,17,6,28};
	long start = System.nanoTime();
	Random r = new Random();
	int[] arr = new int[50];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt(50);
	}
	testList2.sort(arr);
	testList2.printArray(arr);
	long end = System.nanoTime();
	long total = end - start;
	System.out.println(total);
}
}
