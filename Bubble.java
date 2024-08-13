
public class  Bubble{
     int bubbleSort(int arr[]) {
        int i, j, temp;
        int n = arr.length;
        boolean swapped;
        int step = 0;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    step ++;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        return step;
    }

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 


   public static void main(String[] args) {
    Main obj = new Main();
    int arr[] = {2,34,45,65,4,3};
    double start_sort = System.nanoTime();
    obj.bubbleSort(arr);
    System.out.println("printed sorting arrray");
    obj.printArray(arr);
    double end_sort = System.nanoTime();
    System.out.println("time taken by sorting: " +(end_sort-start_sort));
    System.out.println("stn bb gep:" +step);
   }
}