
import java.util.Scanner;

class SumAverageArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int average = 0 ;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            average = sum/n;            
        }
        System.out.println("sum: " +sum);
        System.out.println("average: "+average);
    }
}