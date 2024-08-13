import java.util.Scanner;

public class First {
      public static void main(String[] args) {
        System.out.println("Enetr the number of element:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,count = 0;
        double start_Time = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            sum += i;
            count++;
            }
        double end_Time = System.nanoTime();
        System.out.println("Sum of n no of element:" +sum);
        System.out.println("Elapsed time = " + (end_Time - start_Time));
        System.out.println("count:" +count);

      }
    
}