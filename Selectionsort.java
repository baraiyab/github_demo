class Main{
     
    
        void sort(int arr[]) 
        { 
            int n = arr.length; 
      
            // One by one move boundary of unsorted subarray 
            for (int i = 0; i < n - 1; i++) { 
                // Find the minimum element in unsorted array 
                int min_idx = i; 
                for (int j = i + 1; j < n; j++) { 
                    if (arr[j] < arr[min_idx]) 
                        min_idx = j; 
                } 
      
                // Swap the found minimum element with the first 
                // element 
                int temp = arr[min_idx]; 
                arr[min_idx] = arr[i]; 
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
}


public class Selectionsort {
   public static void main(String[] args) {
    Main obj = new Main();
    int arr[] = {2,34,45,65,4,3};
    double start_sort = System.nanoTime();
    obj.sort(arr);
    System.out.println("printed sorting arrray");
    obj.printArray(arr);
    double end_sort = System.nanoTime();
    System.out.println("time taken by sorting: " +(end_sort-start_sort));
   
   }
}
