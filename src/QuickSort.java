import java.util.Random;

public class QuickSort
{

    /**
     TODO - indent the methods one further than the class
             You can decide if you want to use tabs or spaces,
             but make them even. Not only does this make the code
             easier to read, it will also make it easier to write
     */
int partition (int arr[], int first, int last)
{  
    int pivot = arr[last]; 
    int i = (first - 1);  
  
    for (int j = first; j <= last - 1; j++)  
    {  
        if (arr[j] < pivot)  
        {  
        	i++; 
            int t = arr[i];  
            arr[i] = arr[j];  
            arr[j] = t;  
        }  
    }  
    int t = arr[i+1];  
    arr[i+1] = arr[last];  
    arr[last] = t;  
    return (i + 1);  
}  
  
void quick(int arr[], int start, int end) 
{  
    if (start < end)  
    {  
        int p = partition(arr, start, end);  
        quick(arr, start, p - 1);  
        quick(arr, p + 1, end);  
    }  
}  
  
void printArr(int arr[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  // TODO - use { ... }
        System.out.print(arr[i] + " ");  
}  
    public static void main(String[] args) {  
    //int arr[] = { 27,11,9,17,6,28 };  
    	Random r = new Random();
    	int[] arr = new int[50];
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = r.nextInt(50);
    	}
    long start = System.nanoTime();
    int n = arr.length;  
    QuickSort q1 = new QuickSort(); // TODO - name this 'quickSort' instead of 'q1'
    q1.quick(arr, 0, n - 1);  
    q1.printArr(arr, n);  
    System.out.println();  
    long end = System.nanoTime();
	long total = end - start;
	System.out.println(total);
    }  
}