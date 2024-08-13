class Main{
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;
         // Initial index of merged subarray array
         int k = l;
         while (i < n1 && j < n2) {
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
 
         // Copy remaining elements of L[] if any
         while (i < n1) {
             arr[k] = L[i];
             i++;
             k++;
         }
 
         // Copy remaining elements of R[] if any
         while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}


public class Mergesort {
    public static void main(String[] args) {
        Main obj = new Main();
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        double start_sort = System.nanoTime();

        System.out.println("Given array is");
        obj.printArray(arr);
        obj.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        obj.printArray(arr);

        double end_sort = System.nanoTime();

        System.out.println("Time taken by mergesort: " +(end_sort-start_sort));
    }
}