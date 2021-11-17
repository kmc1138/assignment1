import java.util.Random;

public class MergeSort 
{
   public void merge(int arr[], int left, int mid, int right)
    {
        int one = mid - left + 1;
        int two = right - mid;
  
        int L[] = new int[one];
        int R[] = new int[two];
  
        for (int i = 0; i < one; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < two; ++j)
            R[j] = arr[mid + 1 + j];
  
        int i = 0, j = 0;
  
        int k = left;
        while (i < one && j < two) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < one) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        while (j < two) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

  public void sort(int arr[], int left, int right)
    {
        if (left < right) {
            int m =left+ (right-left)/2;
  
            sort(arr, left, m);
            sort(arr, m + 1, right);
  
            merge(arr, left, m, right    );
        }
    }
  
   public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
       // int arr[] = {27, 11, 9, 17, 6, 3};
    	long start = System.nanoTime();
    	Random r = new Random();
    	int[] arr = new int[50];
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = r.nextInt(50);
    		//System.out.print(arr[i] + " ");
    			}
      MergeSort testList = new MergeSort();
        testList.sort(arr, 0, arr.length - 1);
      
    	testList.printArray(arr);
    	long end = System.nanoTime();
    	long total = end - start;
    	System.out.println(total);
    }
}
