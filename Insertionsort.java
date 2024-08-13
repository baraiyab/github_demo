class Main{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
               
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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



public class Insertionsort {
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
