import java.util.Random;

public class MergeSort 
{
   public void merge(int arr[], int left, int mid, int right)
    {
        /*
         TODO - these two names 'one' and 'two' are not very
                expressive.  The name 'one' doesn't convey the
                intended use of the value that it stores.

         TODO - these two names actually become quite confusing when
                used in the expressions on lines 30, 42, and 48.  If a
                variable is named 'one', I might expect to be storing
                the value 1.  Same for 'two'.
         */

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

    /**
     * TODO - This method looks really good.  It's very simply stated.
     *          There is not one thing in this method that does not need to be there,
     *          and the names of the variables and the helper method that it calls
     *          make it very expressive.  Good work!
     */
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
      MergeSort testList = new MergeSort(); // TODO - name this mergeSort
        testList.sort(arr, 0, arr.length - 1);
      
    	testList.printArray(arr);
    	long end = System.nanoTime();
    	long total = end - start;
    	System.out.println(total);
    }
}
