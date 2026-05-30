
import java.util.Scanner;

class CountOccurance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target: ");
        int target = sc.nextInt();
        int a;
        int count = 0;
        for (a = 0; a < n; a++) {
            if(arr[a]==target){
                count++;
            }     
        }
        System.out.println(count);
    }
}